package com.uni.service;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import com.uni.bo.CaronaVaccine;

public interface ICaronaService  {
	public Iterable<CaronaVaccine> fetchDetails(boolean order, String...props);
	public Iterable<CaronaVaccine> fetchAll(int pageNo,int pageSize,boolean order,String...props);

}
