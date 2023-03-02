package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DataBaseExample.CarRepo;
import com.example.demo.entity.Car;

@Service
	public class CarService {
	@Autowired
	CarRepo carep;
	public List<Car> findByCarNameStartingWith(String prefix){
		return carep.findByCarNameStartingWith(prefix);
	}
	public List<Car>findByCarNameEndingWith(String sufix){
		return carep. findByCarNameEndingWith(sufix);
	}
	public List<Car>findByOwnersLessThan(int owners){
		return carep.findByOwnersLessThan(owners);
	}
	public List<Car> findByOwnersGreaterThan(int owners){
		return carep.findByOwnersGreaterThan(owners);
	}
	public List<Car> findByOwnersLessThanEqual(int owners){
		return carep.findByOwnersLessThanEqual(owners);
	}
	public List <Car> findByOwnersGreaterThanEqual(int owners){
		return carep.findByOwnersGreaterThanEqual(owners);
	}
	public int updateCarOwner(int own,int id) {
		int result = carep.updateCarOwner(own, id);
		return result;
	}
	public int deleteCarDetails(int id) {
		int delRes = carep.deleteCarDetails(id);
		return delRes;
	}
}