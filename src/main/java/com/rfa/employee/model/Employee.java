package com.rfa.employee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@ApiModelProperty(value = "Date of Bird")
	private Date dob;
	private String address;
	private String phone;
	private Integer age;
	
	@ApiModelProperty(value = "Place of Bird")
	private String pob;
	private Long salary;
	private Long id_div;
	
	public Employee() 
	{
		
	}
	
	public Employee(Long id, String name, Date dob, String address, String phone, Integer age, String pob, Long salary, Long id_div)
	{
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.pob = pob;
		this.salary = salary;
		this.id_div = id_div;
	}
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Long getId_div() {
		return id_div;
	}
	public void setId_div(Long id_div) {
		this.id_div = id_div;
	}
	
	public String ToString() {
		return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", pob=" + pob + ", salary=" + salary+ ", age=" + age+ ", phone=" + phone+ ", address=" + address
			       + "]";
	}
	
}
