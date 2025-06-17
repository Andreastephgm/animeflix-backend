package com.animeflix.animeflix.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serieId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category categorySerie;

    private String description;
}

