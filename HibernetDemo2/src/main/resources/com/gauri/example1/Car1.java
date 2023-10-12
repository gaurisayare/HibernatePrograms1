package com.gauri.example1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car1{
	
@Id	
private int id;
@Column
private String carName;
@Column
private double cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}



}