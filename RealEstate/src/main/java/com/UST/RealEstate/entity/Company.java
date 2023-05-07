package com.UST.RealEstate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="realtor_data")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String status;
    private Double bed;
    private Double bath;
    private Double acre_lot;
    private String city;
    private String state;
    @Column(name="zip_code")
    private Double zipcode;
    private String house_size;
    private String soldDate;
    private Double price;


}
