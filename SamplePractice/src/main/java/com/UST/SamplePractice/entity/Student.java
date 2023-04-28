package com.UST.SamplePractice.entity;

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
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String rollNo;
    private String emailId;
}
