# FetchNseOptionChain
Education and learning purpose project to read options chain data from NSE website

http://hostname:port/opt/by/price/<symbol>/<Strik Price>
  
  eg: http://localhost:8080/opt/by/price/ITC/190
  
  ![image](https://user-images.githubusercontent.com/19818842/119996360-4d992000-bfec-11eb-9bf0-56ca461501c2.png)
  
http://hostname:port/opt/by/expiry/ITC/<Expiry Date>
  
  eg: http://localhost:8080/opt/by/expiry/ITC/27MAY2021

  ![image](https://user-images.githubusercontent.com/19818842/119996729-a7014f00-bfec-11eb-91cd-61d623659984.png)
  
http://hostname:port/opt/by/expiry/all/<Expiry Date>
  
  eg: http://localhost:8080/opt/by/expiry/all/27MAY2021
  
  To get all the NSE stocks option chain details by expiry date.

http://hostname:port/opt/by/async/all/<Expiry Date>
  
  eg: http://localhost:8080/opt/by/async/all/27MAY2021
  
  To get all the NSE stocks option chain details using async method by expiry date.
