package com.verizon.springstarter;

public class Engineer {
	// traditional way
	String name;
	String skills;

	Engineer(String name, String skills) {
		this.name = name;
		this.skills = skills;
	}

	public Engineer() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", skills=" + skills + "]";
	}

	void workForWages() {
		System.out.println("Engineers work for wages...");
		System.out.println("Hey this is " + name + " And my skills are: " + skills);

	}
}
