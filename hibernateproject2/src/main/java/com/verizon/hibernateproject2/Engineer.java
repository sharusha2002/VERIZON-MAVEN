package com.verizon.hibernateproject2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="engineer")
public class Engineer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eng_id")
	Integer id;
	
	@Column(name="eng_name")
	String name;
	
	@Column(name="eng_dept")
	String dept;
	
	@Column(name="eng_clg_name")
	String clg;

	public Engineer() {
		
	}
	public Engineer(String name, String dept, String clg) {
		super();
		this.name = name;
		this.dept = dept;
		this.clg = clg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", name=" + name + ", dept=" + dept + ", clg=" + clg + "]";
	}
	
	
}
