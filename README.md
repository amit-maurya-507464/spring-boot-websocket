# Spring Boot WebSocket (Chaating App)
This is a chat Appliaction built using Spring Boot and WebSocket.

## Runing and Testing
**IDE:** 
Open project in any IDE and run as a spring boot Project. <br>
**Command line:** 
Open terminal and loacte to pom.xml file directory and type command - 
`mvn dpring-boot:run`

Use the following url to test the Application:
http://localhost:8080/swagger-ui/index.html

## Dependencies
```
<!--WebSocket starter dependency-->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-websocket</artifactId>
</dependency>

<!-- RabbitMQ Starter Dependency -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>

<!-- Following additional dependency is required for Full Featured STOMP Broker Relay -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-reactor-netty</artifactId>
</dependency>
```

## User Interface
