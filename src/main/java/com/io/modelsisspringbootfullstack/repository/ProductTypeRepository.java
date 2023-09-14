package com.io.modelsisspringbootfullstack.repository;

import com.io.modelsisspringbootfullstack.domain.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTypeRepository extends JpaRepository<ProductType,Long> {
}
