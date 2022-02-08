package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "appointments")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotNull
	@NotBlank
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String name;

	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private Integer age;
	
	@NotNull
	@NotBlank
	private String email;
	
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private String mobilenum;
	
	@NotNull
	@NotBlank
	private String AddressLine1;
	
	@NotNull
	@NotBlank
	private String AddressLine2;
	
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String city;
	
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String state;
	
	@NotBlank
	@NotNull
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String country;
	
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	private String pincode;

	private String trainerPref;

	@Pattern(regexp = "^(?:Yes|No)$")
	private String physioReq;

	@Pattern(regexp = "^(?:Basic|Premium)$")
	private String packageSel;

	@Pattern(regexp = "[0-9 ]+")
	private String weeks;

	@Pattern(regexp = "[0-9 ]+")
	private String amount;

	
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	public String getAddressLine1() {
		return AddressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return AddressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public String getTrainerPref() {
		return trainerPref;
	}

	public void setTrainerPref(String trainerPref) {
		this.trainerPref = trainerPref;
	}

	public String getPhysioReq() {
		return physioReq;
	}

	public void setPhysioReq(String physioReq) {
		this.physioReq = physioReq;
	}

	public String getPackageSel() {
		return packageSel;
	}

	public void setPackageSel(String packageSel) {
		this.packageSel = packageSel;
	}

	public String getWeeks() {
		return weeks;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


}
