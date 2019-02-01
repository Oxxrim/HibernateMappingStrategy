package com.internship.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@Data
@ToString
@MappedSuperclass
public abstract class Organism  {

    private String type;
}
