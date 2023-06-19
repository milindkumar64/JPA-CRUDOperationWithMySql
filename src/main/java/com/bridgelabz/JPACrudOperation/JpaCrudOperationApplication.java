package com.bridgelabz.JPACrudOperation;

import com.bridgelabz.JPACrudOperation.doa.UserRepository;
import com.bridgelabz.JPACrudOperation.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaCrudOperationApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(JpaCrudOperationApplication.class, args);
//		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//
//
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
	}
}
