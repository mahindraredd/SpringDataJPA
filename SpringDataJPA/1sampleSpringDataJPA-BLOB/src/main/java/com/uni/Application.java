package com.uni;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.uni.bo.MarriageSeeker;
import com.uni.service.IMarraigeService;



@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext factory= SpringApplication.run(Application.class, args);
		IMarraigeService service=factory.getBean(IMarraigeService.class);
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=scan.next();
		
		System.out.println("Enter your address");
		String address=scan.next();
		
		System.out.println("Enter your photopath");
		String photoPath=scan.next();
		
		System.out.println("Enter your biodata Path");
		String bioDataPath=scan.next();
		
		System.out.println("Are you Indian");
		boolean isIndain=scan.nextBoolean();
		
		InputStream inputStream=new FileInputStream(photoPath);
		byte[] photoData=new byte[inputStream.available()];
		File file=new File(bioDataPath);
		Reader reader=new FileReader(file);
		char[] bioDataContent=new char[(int)file.length()];
		reader.read(bioDataContent);
		MarriageSeeker seeker=new MarriageSeeker(name, address, photoData, LocalDateTime.of(1999,8, 10,14,10), bioDataContent, isIndain);
		System.out.println(service.registerMarriageService(seeker));
		
		//"C:\Users\rajas\Downloads\photo.jpg"
				//"C:\Users\rajas\Downloads\mahindra.txt"
		
		
		
		
	}

}