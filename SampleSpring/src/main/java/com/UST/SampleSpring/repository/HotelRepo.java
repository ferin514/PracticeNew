package com.UST.SampleSpring.repository;

import com.UST.SampleSpring.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<Hotel,Integer> {
}
