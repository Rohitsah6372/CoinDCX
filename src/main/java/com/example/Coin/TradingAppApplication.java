package com.example.Coin;

import com.example.Coin.service.WebSocketService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TradingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingAppApplication.class, args);
	}

	@Bean
	CommandLineRunner run(WebSocketService webSocketService) {
		return args -> {
			webSocketService.start();
		};
	}
}
