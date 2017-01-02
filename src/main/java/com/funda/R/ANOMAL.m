%% Reset

clear all;
close all;
clc;
%% Preset

slCharacterEncoding('UTF-8');
dList=dir('*.csv');
%% Parameter

% sales cell
% store | menu | date,price

%Param.mode
%1:year 2:month 3:day 4:hour
clc;
Param.mode = 2; %month
Param.numData=length(dList);
Param.windowSize = 3; %for month timepoints, it is 1 year long
Param.delayMarkov = 6;
%% Parse
sales = cell(Param.numData,3);

for i = 1:Param.numData
%Precheck format of the file
    file = fopen(dList(i).name,'r');
    
    lineCheck = fgetl(file);
    maxDel = 0;
    minDel = inf;
    numLine = 0;
    
    while ischar(lineCheck)
        numLine = numLine+1;
       if maxDel < sum(lineCheck==',');
          maxDel =  sum(lineCheck==',');
          
       end
       if minDel > sum(lineCheck==',');
          minDel =  sum(lineCheck==',');
       end
       
%        if sum(lineCheck==',')==4
%           fprintf('%d line is wrong.\n',numLine);%test 
%        end
       lineCheck = fgetl(file);
    end
    
    fclose(file);
    
    
%For different format    
%     if (maxDel ~= 3) || (minDel ~= 3)
%         fprintf('%s has different format.\n',dList(i).name);
        expr = '([^,]*\s?)*';
        
        data = cell(1,4);
        data{1} = cell(numLine,1);
        data{2} = cell(numLine,1);
        data{3} = cell(numLine,1);
        data{4} = zeros(numLine,1);
        
        file = fopen(dList(i).name,'r');
                
        for j=1:numLine
            tLine=fgetl(file); 
           par = regexp(tLine, expr, 'match');
           [~,numPar] = size(par); 
           data{1}{j,1} = par{1};
           data{2}{j,1} = par{2};
           for k = 3:numPar-1
              data{3}{j,1} = [data{3}{j,1} par{k}]; 
           end           
           data{4}(j,1) = str2double(par{numPar});
        end 
        
        sales{i,1}=char(data{1,1}(1,1));
        sales{i,2}=char(data{1,3});
        [numDates,~]=size(data{1,2});
        sales{i,3}=zeros(numDates,8);
        data{1,2}=char(data{1,2});

        for j = 1:numDates
            sales{i,3}(j,1)=str2double(data{1,2}(j,1:4));    
            sales{i,3}(j,2)=str2double(data{1,2}(j,6:7));
            sales{i,3}(j,3)=str2double(data{1,2}(j,9:10));
            sales{i,3}(j,4)=str2double(data{1,2}(j,12:13));
            sales{i,3}(j,5)=str2double(data{1,2}(j,15:16));
            sales{i,3}(j,6)=str2double(data{1,2}(j,18:19));
            sales{i,3}(j,7)=str2double(data{1,2}(j,21:23));
            sales{i,3}(j,8)=data{1,4}(j,1); 
        end

        fclose(file);        
end

%% Extract seq

seq = cell(Param.numData,1);

for i = 1:Param.numData
    if isempty(sales{i,3})
       continue; 
    end
    [numItem, ~] = size(sales{i,3});
    tempDate = zeros(numItem,1);
    for j = 1:numItem
        for k = 1:Param.mode
            tempDate(j) = tempDate(j) + sales{i,3}(j,k)*power(10,6-2*k);
        end
    end
    dates = unique(tempDate);
    
    [numDate,c] =size(dates);
    seq{i} = zeros(numDate,2);
    seq{i}(:,1) = dates;
    
    countDate = 1;
    for j = 1:numItem
       if seq{i}(countDate,1) ~= tempDate(j)
          countDate = countDate+1; 
       end
        seq{i}(countDate,2) = seq{i}(countDate,2)+ sales{i,3}(j,8);         
    end    
end

final=cell(Param.numData,2);
final(:,1) = sales(:,1);
final(:,2)= seq;

%% Test (Distribution of dates)

dateDist = [];

for i = 1:Param.numData
   dateDist = [dateDist; seq{i,1}(:,1)]; 
end
dateDist = sort(unique(dateDist));
[r,c]=size(dateDist);
dateDist = [dateDist zeros(r,1)];

for i = 1:Param.numData
    [r,c] = size(seq{i,1});
   for j = 1:r
       temp=find(dateDist(:,1)==seq{i,1}(j,1));
        dateDist(temp,2)=dateDist(temp,2)+1;   
   end
end

%% Average & STD (At most 12 months)
disp('Average & STD anomaly');
score = [];
d = Param.windowSize;
for i = 1:Param.numData

    initPoint = 1;
    [numDate,~] = size(seq{i,1});
    while initPoint+d-1 <= numDate
        temp = seq{i,1}(initPoint:initPoint+d-1,2);        
        score = [score; (mean(temp)-min(temp))/std(temp)];        
        initPoint = initPoint+1;
    end  
end


meanScore = mean(score);

% Apply on labeled data
dLabel = dir('*.txt');
d=Param.windowSize;
for i = 1:length(dLabel)
    label = load(dLabel(i).name,'r');
   
    initPoint = 1;
    [numDate,~] = size(label(:,1));
    while initPoint+d-1 <= numDate
        temp = label(initPoint:initPoint+d-1,:);
        
        LO = mean(temp(:,2))-meanScore*std(temp(:,2));
        %disp(std(temp(:,2)));
        initPoint = initPoint+1;

       if temp(floor((d-1)/2+1),2) <= LO
            fprintf('Anomaly at "%d" in %s\n',temp(floor((d-1)/2+1),1),dLabel(i).name);
       end

    end
end
fprintf('\n');


%% Markov

% Quantize train seq
d = Param.delayMarkov;
qSeq = cell(Param.numData,1);

for i = 1:Param.numData
    temp = zeros(length(seq{i,1})-1,2);
    for j = 1:length(seq{i,1})-1
       temp(j,1) = seq{i,1}(j+1,1);
       temp(j,2) = (sign(seq{i,1}(j+1,2)-seq{i,1}(j,2))+1)/2;
    end
    qSeq{i,1} = temp;
end

% Probability estimation
pat = zeros(power(2,d+1),1);
patPast = zeros(power(2,d),1);
for i = 1:Param.numData
    s = qSeq{i,1};
    [numPoint,~] = size(s);
    for j = 1:numPoint-d
        index = 0;
        for k = j:j+d-1
            index = index*2 + s(k,2);
        end

        
        patPast(index+1) = patPast(index+1) + 1;
        index = 2*index + s(j+d,2);
        pat(index+1) = pat(index+1) + 1;       
    end
end

mProb=zeros(power(2,d+1),1);

for i=1:length(pat)
    if patPast(mod(i-1,power(2,d))+1) ~= 0
        mProb(i) = pat(i)/patPast(mod(i-1,power(2,d))+1);
    end
end

% Quantize test seq & detect
disp('Markov anomaly');
dLabel = dir('*.txt');

d=Param.delayMarkov;
for i = 1:length(dLabel)
    label = load(dLabel(i).name,'r');
   
    tempQ = zeros(length(label)-1,2);
    for j = 1:length(label)-1
       tempQ(j,1) = label(j+1,1);
       tempQ(j,2) = (sign(label(j+1,2)-label(j,2))+1)/2;
    end
    
    
    for j = 1:length(tempQ(:,2))-d
        index= 0;
        for k = j:j+d-1
            index = index*2 + tempQ(k,2);
        end
        if ((mProb(index+1)< mProb(2*index+1+1)) && (tempQ(j+d,2) == 0)) %|| (mProb(2*index+1) > mProb(2*index+1+1) && (tempQ(j+d,2) == 1))
            fprintf('Anomaly at "%d" in %s\n',tempQ(j+d,1),dLabel(i).name);
        end
    end
    
end
fprintf('\n');

%% Characteristic

monthDist = zeros(Param.numData,1);

for i = 1:Param.numData
   monthDist(i,1) = length(qSeq{i,1});    
end
lenUniq = unique(monthDist(:,1));
lenUniq = [sort(lenUniq) zeros(length(lenUniq),1)];

for i = 1:length(lenUniq)
   lenUniq(i,2) = length(find(monthDist==lenUniq(i,1) ));
end

