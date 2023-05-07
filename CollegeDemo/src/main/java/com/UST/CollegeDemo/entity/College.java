package com.UST.CollegeDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="college")
public class College {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;
    private String zipcode;

}
