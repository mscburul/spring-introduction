package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	    //SpringApplication.run(DemoApplication.class, args);
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
	    int result = binarySearch.binarySearch(new int[] {21,32,12},12);
        System.out.println(result);

	}
}
