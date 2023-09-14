package com.io.modelsisspringbootfullstack.service;

import com.io.modelsisspringbootfullstack.domain.Product;
import com.io.modelsisspringbootfullstack.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long productId, Product product) {
        Optional<Product> existingProduct = productRepository.findById(productId);
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setId(product.getId());

            //updatedProduct.setName(product.getName());
            // Mettez à jour d'autres propriétés si nécessaire
            return productRepository.save(updatedProduct);
        }
        return null;
    }
}
