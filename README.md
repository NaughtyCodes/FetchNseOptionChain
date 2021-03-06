# FetchNseOptionChain
Education and learning purpose project to read options chain data from NSE website

## Project Structure

![image](https://user-images.githubusercontent.com/85377881/120890353-c9641f80-c61f-11eb-9f23-aac89fa066a0.png)

## UI https://naughtycodes.github.io/Engal

![image](https://user-images.githubusercontent.com/19818842/121783551-df984f80-cbcc-11eb-8eac-fa623db30847.png)

![image](https://user-images.githubusercontent.com/19818842/126031110-8ebe5475-ee37-4caa-8145-ff45185e3331.png)


http://hostname:port/opt/by/price/[symbol]/[Strik-Price]
  
  eg: http://localhost:8080/opt/by/price/ITC/190
  
![image](https://user-images.githubusercontent.com/19818842/123513534-580e0e80-d6ab-11eb-9437-3a4b32bcf2ea.png)
  
http://hostname:port/opt/by/expiry/ITC/[Expiry-Month]
  
  eg: http://localhost:8080/opt/by/expiry/ITC/MAY

![image](https://user-images.githubusercontent.com/19818842/123513478-12e9dc80-d6ab-11eb-856e-595c7723e63f.png)

"http://hostname:port/opt/all/[Expiry-Month]"
  
  eg: http://localhost:8080/opt/all/[ month ]?gitFlag=false
  
  To get all the NSE stocks option chain details by expiry month.

## Swagger Url

  http://localhost:8080/swagger-ui.html#/options-web-controller
  
 ![image](https://user-images.githubusercontent.com/19818842/125173525-744a9900-e1dd-11eb-9bf2-ac05d76f116f.png)



