package com.verizon.hibernateproject;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")

public class Doctor {
	
	public Doctor() {
		
	}
	

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", speciality=" + speciality + ", location=" + location + "]";
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="doc_id")
	Integer id;
	
	@Column(name="doc_name")
	String name;
	
	@Column(name="doc_speciality")
	String speciality;
	
	@Column(name="doc_location")
	String location;

	public Doctor(String name, String speciality, String location) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
