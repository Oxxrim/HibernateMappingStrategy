package com.internship.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;


@Data
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("human")
@DiscriminatorColumn(name = "human_kind")
public abstract class Human extends Organism{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String kindOfActivity;
}
