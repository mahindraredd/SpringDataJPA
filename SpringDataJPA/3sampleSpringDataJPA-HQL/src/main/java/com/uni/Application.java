package com.uni;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uni.bo.CaronaVaccine;
import com.uni.bo.Customer;
import com.uni.service.ICaronaService;
import com.uni.types.ResultView;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext factory= SpringApplication.run(Application.class, args);
		ICaronaService service=factory.getBean(ICaronaService.class);
		//service.fetchDetails(false,"price").forEach(list->System.out.println(list.getPrice()+" "+list.getName()));
		//service.fetchAll(0, 5, false,"price").forEach(list->System.out.println(list.getPrice()+" "+list.getName()));
//		CaronaVaccine vaccine=new CaronaVaccine();
//		vaccine.setRegNo(1L);
//		service.findAllbyObjects(vaccine, false, "price","companyName").forEach(System.out::println);
//		List<Long> ids= new ArrayList<Long>();
//		ids.add(1L);
//		ids.add(4L);
//		ids.add(5L);
		
		//service.fetchByCompanyNameIs("Novavax, Inc.").forEach(System.out::println);
//		List<ResultView> list=service.fetchByPriceGreaterThanEqualOrderByPrice(400);
//		list.forEach(vacc->{
//			System.out.println(vacc.getCompanyName()+" "+vacc.getPrice());
//		});
//	
		Customer c=new Customer();
	
	
	}

}