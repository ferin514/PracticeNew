package com.UST.CarEcommerce.controller;

import com.UST.CarEcommerce.entity.Car;
import com.UST.CarEcommerce.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/addcar")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }
    @GetMapping("/getcar")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
}
