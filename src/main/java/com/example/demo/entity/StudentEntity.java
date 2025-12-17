package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StudentEntity{

    @Id  //primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY) //to generate values automatically
    private Long id;
    private String name;
    private float cgpa;
    private Striing email;

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }
    public String setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public float setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public float getCgpa(){
        return cgpa;
    }
    public String setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
   
}