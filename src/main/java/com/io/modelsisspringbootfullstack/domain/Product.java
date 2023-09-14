package com.io.modelsisspringbootfullstack.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Entity
public class Product {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dateCreated;
    private String action;
    @ManyToOne
    @JoinColumn(name = "product_type_id")
    private ProductType type;

    public Product() {
    }

    public Product(Long id, String name, Date dateCreated, String action, ProductType type) {
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.action = action;
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
