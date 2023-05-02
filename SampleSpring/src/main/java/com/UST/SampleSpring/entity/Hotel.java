package com.UST.SampleSpring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="HOTEL_DETAILS")
public class Hotel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String place;
    private String status;
}
