package com.example.demo.databaseExample.entity;


import jakarta.persistence.Column;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Table(name="student")

public class Entity{

@Id

@Column(name="ID")

@GeneratedValue

private int id;

@Column(name="Name")

private String name;

@Column(name="Marks")

private int marks;

public int getid() {

return id;

}

public void setid(int id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public int getMarks() {

return marks;

}

public void setMarks(int marks) {

this.marks = marks;

}

public Entity(int id, String name, int marks) {

super();

this.id = id;

this.name = name;

this.marks = marks;

}

}
