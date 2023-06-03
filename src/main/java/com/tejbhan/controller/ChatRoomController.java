package com.tejbhan.controller;

import com.tejbhan.dto.Message;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

import static java.lang.String.format;

@Controller
@Slf4j
public class ChatRoomController {

    private static final String MESSAGE_FORMAT = "/chat-room/%s";

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    @MessageMapping("/chat/{roomId}/sendMessage")
    public void sendMessage(@DestinationVariable String roomId, @Payload Message chatMessage) {
        chatMessage.setType(Message.MessageType.CHAT);
        LocalDateTime time = LocalDateTime.now();
        chatMessage.setTime(time);
        messagingTemplate.convertAndSend(format(MESSAGE_FORMAT, roomId), chatMessage);
    }

    @MessageMapping("/chat/{roomId}/addUser")
    public void addUser(@DestinationVariable String roomId, @Payload Message chatMessage) {
        chatMessage.setType(Message.MessageType.JOIN);
        String message = chatMessage.getSender() + " joined";
        chatMessage.setContent(message);
        log.info(message);
        messagingTemplate.convertAndSend(format(MESSAGE_FORMAT, roomId), chatMessage);
    }

    @MessageMapping("/chat/{roomId}/leaveUser")
    public void leaveUser(@DestinationVariable String roomId, @Payload Message chatMessage) {
        chatMessage.setType(Message.MessageType.LEAVE);
        String message = chatMessage.getSender() + " left";
        chatMessage.setContent(message);
        log.info(message);
        messagingTemplate.convertAndSend(format(MESSAGE_FORMAT, roomId), chatMessage);
    }

    @MessageMapping("/chat/{roomId}/raiseHand")
    public void raiseHand(@DestinationVariable String roomId, @Payload Message chatMessage) {
        chatMessage.setType(Message.MessageType.RAISE_HAND);
        String message = chatMessage.getSender() + " raised Hand";
        chatMessage.setContent(message);
        log.info(message);
        messagingTemplate.convertAndSend(format(MESSAGE_FORMAT, roomId), chatMessage);
    }

}
