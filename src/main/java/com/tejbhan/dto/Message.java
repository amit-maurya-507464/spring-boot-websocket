package com.tejbhan.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Message {

    public enum MessageType {
        CHAT, JOIN, LEAVE, RAISE_HAND
    }

    private MessageType type;
    private String content;
    private String sender;
    private String image;
    private LocalDateTime time;

}