package com.tejbhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class WebSocketChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketChatApplication.class, args);
	}

	@PostConstruct
	void started() {
		//Setting default time zone to UTC
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

}
