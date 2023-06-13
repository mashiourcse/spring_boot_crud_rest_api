package com.codemyth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private Float salary;

	@Column(name = "age")
	private int age;

	@Column(name = "city")
	private String city;
	




	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Float getSalary() {
		return salary;
	}





	public void setSalary(Float salary) {
		this.salary = salary;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", city=" + city + "]";
	}





	public Employee(Long id, String name, Float salary, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}





	public Employee() {

	}



	
}