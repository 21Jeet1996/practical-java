package com.course.practicaljava.service;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.course.practicaljava.entity.Car;
import com.course.practicaljava.entity.Engine;
import com.course.practicaljava.entity.Tire;
import com.course.practicaljava.util.RandomDateUtil;

@Service
public class RandomCarService implements CarService {

	@Override
	public Car genrateCar() {

		var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
		var color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
		var type = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));

		var available = ThreadLocalRandom.current().nextBoolean();
		var price = ThreadLocalRandom.current().nextInt(5000, 12001);
		var firstReleaseDat = RandomDateUtil.genrateRandomLocalDate();

		int randomCount = ThreadLocalRandom.current().nextInt(ADDITIONAL_FETURES.size());
		var additionalFetures = new ArrayList<String>();

		for (int i = 0; i < randomCount; i++) {
			additionalFetures.add(ADDITIONAL_FETURES.get(i));
		}

		var fuel = FUELS.get(ThreadLocalRandom.current().nextInt(FUELS.size()));
		var horsePower = ThreadLocalRandom.current().nextInt(100, 121);
		var engine = new Engine();
		engine.setFuleType(fuel);
		engine.setHorsePower(horsePower);

		var tires = new ArrayList<Tire>();
		for (int i = 0; i < 3; i++) {
			var tire = new Tire();
			var manufacturer = TIRE_MANUFACTURERES.get(ThreadLocalRandom.current().nextInt(TIRE_MANUFACTURERES.size()));
			var size = ThreadLocalRandom.current().nextInt(15, 18);
			var tirePrice = ThreadLocalRandom.current().nextInt(200, 401);
			tire.setManufacturer(manufacturer);
			tire.setPrice(tirePrice);
			tire.setSize(size);
			tires.add(tire);
		}

		var result = new Car(brand, color, type);
		result.setAvailable(available);
		result.setPrice(price);
		result.setFirstReleasedate(firstReleaseDat);
		result.setAdditionalFetures(additionalFetures);
		result.setEngine(engine);
		result.setTire(tires);
		return result;
	}

}
