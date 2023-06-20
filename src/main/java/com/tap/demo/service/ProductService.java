package com.tap.demo.service;

import java.util.List;

import com.tap.demo.model.Product;

public interface ProductService{

    public Product savaProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);

    public String deleateProduct(Integer id);
    
    public Product editProduct(Product product, Integer id);
}
