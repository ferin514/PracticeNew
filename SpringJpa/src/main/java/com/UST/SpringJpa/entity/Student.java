package com.UST.SpringJpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "STUDENT_RECORD")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id

    private Long id;
    private String name;
    private String emailId;
    private String phno;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> courses;
    private String address;
    private String comments;


}
