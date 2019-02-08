package com.internship.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Dog extends Organism {

    @Id
    /*@SequenceGenerator(name = "seq", allocationSize = 1)*/
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private int averageTimeOfLife;
    private String owner;

}
