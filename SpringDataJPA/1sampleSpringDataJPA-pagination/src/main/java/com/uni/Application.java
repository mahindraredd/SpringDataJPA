package com.uni;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uni.bo.CaronaVaccine;
import com.uni.service.ICaronaService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext factory= SpringApplication.run(Application.class, args);
		ICaronaService service=factory.getBean(ICaronaService.class);
		//service.fetchDetails(false,"price").forEach(list->System.out.println(list.getPrice()+" "+list.getName()));
		service.fetchAll(0, 5, false,"price").forEach(list->System.out.println(list.getPrice()+" "+list.getName()));
	}

}