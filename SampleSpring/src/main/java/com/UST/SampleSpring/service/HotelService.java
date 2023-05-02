package com.UST.SampleSpring.service;

import com.UST.SampleSpring.entity.Hotel;
import com.UST.SampleSpring.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HotelService {
    @Autowired
    private HotelRepo hotelRepo;
    public Hotel addAllHotelDetails(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    public List<Hotel> getAllHotels() {
        return hotelRepo.findAll();
    }

    public Hotel getHotelsById(Integer id) {
        return hotelRepo.findById(id).orElse(null);
    }

    public Hotel update(Hotel hotel) {
        Hotel old=null;
        Optional<Hotel>hotels=hotelRepo.findById(hotel.getId());
        if(hotels.isPresent()){
            old=hotels.get();
            old.setName(hotel.getName());
            hotelRepo.save(old);

        }else{
            return new Hotel();
        }
        return old;
    }

    public String deleteById(Integer id) {
        return "deleted";
    }
}
