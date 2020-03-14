package com.cts.emart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmartUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartUserServiceApplication.class, args);
	}

}


//package com.cts.emart;
//
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//
//public class ServletInitializer extends SpringBootServletInitializer {
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(EmartSellerServiceApplication.class);
//	}
//
//}
