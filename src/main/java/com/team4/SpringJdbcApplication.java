package com.team4;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

}




//package com.team4;
//
//import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
////@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//public class SpringJdbcApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcApplication.class, args);
//	}
//
//}