package com.lemosdev.lemosfood.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class kitchen {

    @Id
    private Long id;

    @Column
    private String name;
}
