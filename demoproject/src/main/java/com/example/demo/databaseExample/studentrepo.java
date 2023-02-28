package com.example.demo.databaseExample;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.databaseExample.entity.Entity;

public interface studentrepo extends JpaRepository<Entity, Integer>{
	
}
