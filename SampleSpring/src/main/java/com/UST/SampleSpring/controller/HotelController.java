package com.UST.SampleSpring.controller;

import com.UST.SampleSpring.entity.Hotel;
import com.UST.SampleSpring.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public Hotel addAllHotelDetails(@RequestBody Hotel hotel){
        return hotelService.addAllHotelDetails(hotel);
    }
    @GetMapping
    public List<Hotel> getAllHotels(){
        return hotelService.getAllHotels();
    }
    @GetMapping("/get/{id}")
    public Hotel getHotelsById(@PathVariable Integer id){
        return hotelService.getHotelsById(id);
    }
    @PutMapping
    public Hotel update(@RequestBody Hotel hotel){
        return hotelService.update(hotel);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable Integer id){
        return hotelService.deleteById(id);
    }
}
