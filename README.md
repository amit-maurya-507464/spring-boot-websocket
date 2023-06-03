# Spring Boot WebSocket (Chatting App)
This is a chat Application built using Spring Boot and WebSocket.

## Technologies used
1. java
2. Spring Boot
3. WebSocket
4. RabbitMQ
5. Netty
6. Html
7. Css
8. JavaScript
9. Bootstrap
10. SockJS
11. StompJS

## Running and Testing
**IDE:** 
Open project in any IDE and run as a spring boot Project. <br>
**Command line:** 
Open terminal and locate to pom.xml file directory and type command - 
`mvn dpring-boot:run`

Use the following url to test the Application:
http://localhost:8080

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

**Home page**

![chat-home.png](assets%2Fimages%2Fchat-home.png)

**Chat Page**

![chat.png](assets%2Fimages%2Fchat.png)

**Raise Hand**

![raise-hand.png](assets%2Fimages%2Fraise-hand.png)

## Usage

To use the application enter your name and room id. 
Room id is a unique id which creates a group chat room.
Users in the same chat room can send messages to each others.
Users can raise hand shot alert to all users of particular chat room.


