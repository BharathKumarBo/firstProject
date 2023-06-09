package com.Springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name= "Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;
    @Column(name="Name")
    private String name;
    @Column(name="Age")
    private int age;
    @Column(name="DateOfJoin")
    private String dataOfJoin;

    private String git;

}
