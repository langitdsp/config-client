
# CONFIG-CLIENT
Java Springboot application that consume config server value.    
Config-server : https://github.com/langitdsp/config-server.git  
Config-value : https://github.com/langitdsp/config-value.git  
  
## Getting Started
This application will get the value from config server.  
This application will run on port 8081  

#### Setup Your Local :
Edit your config source at

    src\main\resources\bootstrap.properties
    spring.cloud.config.uri=http://localhost:8888
    spring.application.name=config-value

To run this application : mvn spring-boot:run    
Access the application on :   
http://localhost:8081/client/message  
http://localhost:8081/client/loginUrl  
http://localhost:8081/client/testNull  

After change some value on the config-value file in git. Do refresh to get the updated value sending empty POST data to http://localhost:8081/actuator/refresh

