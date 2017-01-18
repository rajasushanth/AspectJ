package com.mycomp.dto;

public class Appraisal {
	
	private double currentSalary;
	private double increment;
	private String rating;
	public double getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}
	public double getIncrement() {
		return increment;
	}
	public void setIncrement(double increment) {
		this.increment = increment;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Appraisal(double currentSalary, double increment, String rating) {
		super();
		this.currentSalary = currentSalary;
		this.increment = increment;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Appraisal [currentSalary=" + currentSalary + ", increment=" + increment + ", rating=" + rating + "]";
	}
	
	
}
