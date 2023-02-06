package com.course.practicaljava.entity;

public class Engine {

	private String fuleType;
	private int horsePower;

	public Engine() {
	}

	public Engine(String fuleType, int horsePower) {
		super();
		this.fuleType = fuleType;
		this.horsePower = horsePower;
	}

	public String getFuleType() {
		return fuleType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [fuleType=" + fuleType + ", horsePower=" + horsePower + "]";
	}

}
