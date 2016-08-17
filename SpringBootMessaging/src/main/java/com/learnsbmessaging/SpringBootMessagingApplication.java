package com.learnsbmessaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnsbmessaging.sender.Sender;

@SpringBootApplication
public class SpringBootMessagingApplication implements CommandLineRunner {
	
	@Autowired
	Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMessagingApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		sender.send("First Sender Message from Spring Boot");
	}
}
