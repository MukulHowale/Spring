package com.masai.springintroduction.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// Application Context containing all the beans running
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		// using applicationContext, BinarySearchImpl object is called
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int x = binarySearch.binarySearch(new int[]{12,4,6}, 3);
		System.out.println(x);


	}

}
