package com.io.modelsisspringbootfullstack.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.List;
@Entity
public class ProductType {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @OneToMany(mappedBy = "type")
    private List<Product> products;

    public ProductType() {
    }

    public ProductType(Long id, String type, List<Product> products) {
        this.id = id;
        this.type = type;
        this.products = products;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
