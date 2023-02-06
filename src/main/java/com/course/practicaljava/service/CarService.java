package com.course.practicaljava.service;

import java.util.List;

import com.course.practicaljava.entity.Car;

public interface CarService {

	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "Black", "Whit");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV");
	List<String> ADDITIONAL_FETURES = List.of("GPS", "Alarm", "Sunroof", "Media Player", "Leather Seats");

	List<String> FUELS = List.of("Petrol", "Electric", "Hybrid");
	List<String> TIRE_MANUFACTURERES = List.of("Goodyear", " Bridgestone", "Dunlop");

	Car genrateCar();

}
