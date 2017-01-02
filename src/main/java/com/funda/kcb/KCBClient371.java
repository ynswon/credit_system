package com.funda.kcb;

import java.io.*;
import java.net.Socket;

class KCBClient371
{
    Socket client = null;
    String ipAddress; //접속을 요청할 Server의 IP 주소를 저장할 변수
    static final int port = 43500; //접속을 요청할 Server의 port 번호와 동일하게 지정

    BufferedReader read;
    //입력용 Stream
    InputStream is;
    BufferedReader ois;

    //출력용 Stream
    OutputStream os;
    BufferedWriter oos;

    String sendData;
    String receiveData;

    KCBClient371(String ip)
    {
        ipAddress = ip; //생성자의 IP Address를 ipAddress 맴버변수에 저장

        try
        {
            System.out.println("***** Clinet가 Server로 접속을 시작합니다 *****");

            //*** 접속할 Server의 IP Address와 port 번호 정보가 있는 Socket 생성 ***//
            client = new Socket(ipAddress,port);
            //*** Clinet Socket이 생성되면, Server의 accept()가 수행된다 ***//


            //*** 키보드로부터 message를 읽어올 입력 Stream ***//
//            read = new BufferedReader(new InputStreamReader(System.in));

            //*** Server로 message를 송신하기 위한 출력 Stream ***//
            os = client.getOutputStream();
            oos = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"));

            //*** Server로 보낸 message를 수신받기 위한 입력  Stream ***//
            is = client.getInputStream();
            ois = new BufferedReader(new InputStreamReader(is, "euc-kr"));

            String word="0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          나원준                                                         198804181 010 5040025820160513Y0100360   100       s07036972703        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";
                       //0469SCDEV    X00070000100360B0000002004220160513000000000000020160513000000                                                           1000001240360       1090131536          wonjun                                            8804181075610198804181 010 5040025820160513Y0100360   100       s07036972703        192.168.28.1   allcredit.co.kr                                   0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789
            String word_euc = new String(word.getBytes("euc-kr"), "euc-kr");
            System.out.println("input : ");
            System.out.println(word_euc);
      //      oos.write(word_euc);
            //oos.write(word_euc);
        //    oos.flush();
            String middle="";

            System.out.println("abcd".substring(0,1) + " :" + middle.length());
            System.out.println("abcd".concat("efg") + "abcd".concat("efg") .length());

            String word1="0329SCDEV    X00070000100361B0000002004220160513000000000000020160513000000                                                           1000001089370       1090131536          201605131606481120160513Yzooc010                                                                                                                           ";
            String s1 = word1.substring(0,134);
            String s2 = middle;
            String s3 = word1.substring(190);
            System.out.println("lenght " + s1.length() + " : " + s2.length() + " : " + s3.length());
            System.out.println( "s1 :" + s1);
            System.out.println( "s2 :" + s2);
            System.out.println( "s3 :" + s3);

            middle="1000001240360       1090131536          20160525163929110629";

            String word361 = word1.substring(0,134).concat(middle).concat(word1.substring(190));
            System.out.println(word361.length()+ ":" + word1.length() + "input2 :" + word361);

            oos.write(word361);
            //oos.write(word_euc);
            oos.flush();

            char[] cTot2 = new char[1000];

            StringBuffer rtnStr2 = new StringBuffer("");
            if(ois.read(cTot2)!=-1){
                rtnStr2.append(new String(cTot2));
                System.out.println("output2 : ");
                System.out.println(rtnStr2);
                // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.
            }


            is.close();
            ois.close();
            os.close();
            oos.close();
            client.close(); //Socket 닫기

            client = new Socket(ipAddress,port);

            //*** Server로 message를 송신하기 위한 출력 Stream ***//
            os = client.getOutputStream();
            oos = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"));

            //*** Server로 보낸 message를 수신받기 위한 입력  Stream ***//
            is = client.getInputStream();
            ois = new BufferedReader(new InputStreamReader(is));


            String word2="0295SCDEV    X00070000100371B00000020042201605130000000000000201605130000000123456789ABCDEF00000000000000000000000000000000000000000000000000000000077KCB                 zooc010        7044065490     099000990009900099000990009900099000990009900099000990009900099000990009900099000990009900099000000";

            oos.write(word2);
            //oos.write(word_euc);
            oos.flush();


            char[] cTot3 = new char[1000];

            StringBuffer rtnStr3 = new StringBuffer("");
            if(ois.read(cTot3)!=-1){
                rtnStr3.append(new String(cTot3));
                System.out.println("output3 : ");
                System.out.println(rtnStr3);
                // 전문길이가 전문 맨앞자리에 포함되므로 이미꺼낸 10 byte 는 빼고 꺼낸다.
            }


            is.close();
            ois.close();
            os.close();
            oos.close();
            client.close(); //Socket 닫기



        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("통신 Error !!");
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        new KCBClient371("219.255.136.242"); //Server Program이 실행되는 컴퓨터의 IP Address를 입력
    }
}
