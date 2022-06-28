package com.ugurer.TodoWithReact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ugurer.*")
@ComponentScan(basePackages = { "com.ugurer.*" })
@EntityScan("com.ugurer.*")
public class TodoWithReactApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoWithReactApplication.class, args);
	}

}
