package com.UST.CarEcommerce.service;

import com.UST.CarEcommerce.entity.Car;
import com.UST.CarEcommerce.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;
    public Car addCar(Car car) {
        return carRepo.save(car);
    }

    public List<Car> getAllCars() {
     return carRepo.findAll();
    }
}
