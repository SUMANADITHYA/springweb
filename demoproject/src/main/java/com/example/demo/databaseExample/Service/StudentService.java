package com.example.demo.databaseExample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.databaseExample.studentrepo;
import com.example.demo.databaseExample.Entity;

@Service
public class StudentService {
@Autowired
private studentrepo stu;
public Entity saveDetails(Entity s) {
	return stu.saveAll(s);
}
public List<com.example.demo.databaseExample.entity.Entity> getAllDetails()
{
	return stu.findAll();
}
public void deleteDepartmentById(int id)
{
	stu.deleteById(id);
}
}