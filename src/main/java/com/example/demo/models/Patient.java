package com.example.demo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="patient")
public class Patient {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String name;

  Integer age;

  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
  Date date;
  String manufacturer;
  String dose;

  public Patient(Integer id, String name, Integer age, Date date, String manufacturer, String dose) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.date = date;
    this.manufacturer = manufacturer;
    this.dose = dose;
  }
  public Patient(){}

  // G/S
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
  public String getDose() {
    return dose;
  }
  public void setDose(String dose) {
    this.dose = dose;
  }



}
