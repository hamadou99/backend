package com.io.modelsisspringbootfullstack.service;

import com.io.modelsisspringbootfullstack.domain.ProductType;
import com.io.modelsisspringbootfullstack.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;

    public ProductType createProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }
}