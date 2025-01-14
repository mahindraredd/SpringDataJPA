package com.uni.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Value("${spring.application.name}")
	private String name;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application context args"+Arrays.asList(args.getSourceArgs()));
		System.out.println("Application context args with non optional"+Arrays.asList(args.getNonOptionArgs()));
		System.out.println("Application context args with optional "+Arrays.asList(args.getOptionNames()));
		if(args.getNonOptionArgs().contains("Start"))
			System.out.println("access the data");
		System.out.println("access the propertiees file"+name);
		
		
	}

}
