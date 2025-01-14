package com.uni.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.uni.bo.CaronaVaccine;
import com.uni.types.ResultView;

public interface CaronoVaccineRepo extends JpaRepository<CaronaVaccine, Long> { 
	@Query("FROM CaronaVaccine WHERE doses=:dose")
	public List<CaronaVaccine> fetchVaccinesByCompany(Integer dose);
	@Query("SELECT Name from CaronaVaccine WHERE price BETWEEN :min AND :max")
	public List<Object[]> fetchvaccinesByPriceRange(Integer min,Integer max);
	@Modifying
	@Query("Update CaronaVaccine SET price=:newprice WHERE regNo=:id")
	public int updateprice(int newprice, Long id );

}
