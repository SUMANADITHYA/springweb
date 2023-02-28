package com.example.demo.databaseExample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.databaseExample.Entity;
import com.example.demo.databaseExample.Service.StudentService;

@RestController
public class studentcontroller {
@Autowired
private StudentService stuservice;
@PostMapping("/addStudent")
public String postDetails(@RequestBody Entity s) {
	stuservice.saveDetails(s);
	return "value Added";
}
@GetMapping("/getStudent")
public List<com.example.demo.databaseExample.entity.Entity> getDetails(){
	return stuservice.getAllDetails();
	
}
}
