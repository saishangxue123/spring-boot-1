package com.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author snake
 * @date 2020/4/22 00:10
 */
@ComponentScan("com.snake.*")
@SpringBootApplication
public class TestRun {
	public static void main(String[] args) {
		SpringApplication.run(TestRun.class, args);
	}
}
