package com.io.modelsisspringbootfullstack.ressource;

import com.io.modelsisspringbootfullstack.domain.Product;
import com.io.modelsisspringbootfullstack.domain.ProductType;
import com.io.modelsisspringbootfullstack.service.ProductService;
import com.io.modelsisspringbootfullstack.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productId, product);
        if (updatedProduct == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @PostMapping("/productType")
    public ResponseEntity<ProductType> createProductType(@RequestBody ProductType productType) {
        ProductType createdProductType = productTypeService.createProductType(productType);
        return new ResponseEntity<>(createdProductType, HttpStatus.CREATED);
    }
}

