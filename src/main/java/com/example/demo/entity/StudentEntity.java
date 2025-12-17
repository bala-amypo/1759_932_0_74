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
    private String email;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public float getCgpa(){
        return cgpa;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public StudentEntity(Long id,String name,float cgpa,String email){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
        this.email=email;
    }

    public StudentEntity(){

    }
   
}