package com.exam.product.controller;

import com.exam.product.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping()
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,"San pham A", "thong tin a"));
        products.add(new Product(2L,"San pham B", "thong tin b"));
        products.add(new Product(3L,"San pham C", "thong tin c"));
        return  products;
    }
}
