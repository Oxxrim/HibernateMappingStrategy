package com.internship.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Developer extends Human{

    @Id
    /*@SequenceGenerator(name = "seq", allocationSize = 1)*/
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    private int id;
    private String name;
    private int salary;
}
