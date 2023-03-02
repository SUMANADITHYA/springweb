package com.example.demo.DataBaseExample;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
	 
	   public  List<Car> findByCarNameStartingWith(String prefix);
	   public List<Car> findByCarNameEndingWith(String sufix);
	   public List<Car> findByOwnersLessThan(int owners);
	  public List <Car> findByOwnersGreaterThan(int owners);
	  public List<Car> findByOwnersLessThanEqual(int owners);
	  public List <Car> findByOwnersGreaterThanEqual(int owners);
	  @Query ("Select car from CarModels  car Where car.id=?1" )
	  public List<Car>findAllCarById(int id);
	  @Modifying
	  @Query("Update CarModels car set car.owners=:own where car.id=:id")
	  public int updateCarOwner(@Param("own")int own,@Param("id")int id);
	  @Modifying
	  @Query("Delete from Models2 car where car.id=:id")
	  public int deleteCarDetails(@Param("id")int id);
}
