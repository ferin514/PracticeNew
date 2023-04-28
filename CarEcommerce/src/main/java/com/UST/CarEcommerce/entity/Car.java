package com.UST.CarEcommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    @Id
    @GeneratedValue
    private Long carId;
    private String carName;
    private String year;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private String price;
    @ElementCollection
    private List<String> payment;
    @ElementCollection
    private List<String> cities;
}
