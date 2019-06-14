package com.example.pansDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan({"com.example.pansDemo.user.mapper"})
public class PansDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PansDemoApplication.class, args);
	}

}
