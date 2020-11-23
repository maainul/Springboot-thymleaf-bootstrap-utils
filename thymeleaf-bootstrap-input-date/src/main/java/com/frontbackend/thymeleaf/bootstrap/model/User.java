package com.frontbackend.thymeleaf.bootstrap.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class User {

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date birtdate;

	/**
	 * @param birtdate
	 */
	public User(Date birtdate) {
		super();
		this.birtdate = birtdate;
	}

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @return the birtdate
	 */
	public Date getBirtdate() {
		return birtdate;
	}

	/**
	 * @param birtdate the birtdate to set
	 */
	public void setBirtdate(Date birtdate) {
		this.birtdate = birtdate;
	}

	@Override
	public String toString() {
		return "User []";
	}

}
