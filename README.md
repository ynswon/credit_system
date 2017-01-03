# Credit Evaluation System for retailer

I designed a retail credit evaluation system with credit history, revenue, deliquency, deposits or so on.
I used about 200 parameters for evaluating a retail person using KCB data which is fitted in our sample (such as FICO) 
and using bayesian for time-series prediction for revenue and anomaly detection for deposits .
  
  #1) Data view
    - Credit history(deliquency, debtness, credit history, card payment history or so on)
    - Revenue( Sales, Revenue, Menu, Size, rent fee or so on)
    - Bank deposits ( Cash flow, anomaly point of free cash flow, useless payment)
    - Social Data(Search amount, good/bad mention of stores
    
  #2) algorithm
    - variables selection( EDA, IV Value, KS score or so on)
    - credit evaluation( cross matrix )
    - baysiean( regression )  
    - ensemble(random forest, xgboost ) 
    
