package com.uni.springMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.uni.customerDTO.CustomerDTO;
import com.uni.service.ICustomerService;

@SpringBootApplication
@ComponentScan(basePackages = "com.uni")
@EnableMongoRepositories(basePackages = "com.uni.repository")
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringMongoDbApplication.class, args);
		ICustomerService service = applicationContext.getBean(ICustomerService.class);
		//System.out.println(service.registerCutomer(new CustomerDTO("Venkata Mahindra Reddy Bommu","Narasaraopet", 24)));
		
		//service.findCustomer().forEach(System.out::println);
		//System.out.println(service.updateCustomer(new CustomerDTO("Bommu Mahindra Reddy", "Burmpet", 15)));
		service.getMinorDetails(0, 15).forEach(System.out::println);
		
	}

}
