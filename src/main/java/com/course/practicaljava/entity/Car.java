package com.course.practicaljava.entity;

import java.time.LocalDate;
import java.util.List;

public class Car {

	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	private LocalDate firstReleasedate;
	private List<String> additionalFetures;

	public Car() {

	}

	public Car(String brand, String color, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;

	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LocalDate getFirstReleasedate() {
		return firstReleasedate;
	}

	public void setFirstReleasedate(LocalDate firstReleasedate) {
		this.firstReleasedate = firstReleasedate;
	}

	public List<String> getAdditionalFetures() {
		return additionalFetures;
	}

	public void setAdditionalFetures(List<String> additionalFetures) {
		this.additionalFetures = additionalFetures;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleasedate=" + firstReleasedate + "]";
	}

}
