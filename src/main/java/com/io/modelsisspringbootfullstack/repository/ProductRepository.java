package com.io.modelsisspringbootfullstack.repository;

import com.io.modelsisspringbootfullstack.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
