package com.tap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.demo.model.Product;
import com.tap.demo.repository.ProductRepository;


@Service
public class productServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;

    @Override
    public Product savaProduct(Product product) {
        return productRepo.save(product);

    }

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleateProduct(Integer id) {
       Product product =productRepo.findById(id).get();

       if (product!=null) {
        productRepo.delete(product);
        return "Product Delete Sucessefully";
       } 

       return "Someting wrong on server";

    }

    @Override
    public Product editProduct(Product p, Integer id) {
        Product oldProduct =productRepo.findById(id).get();
        
        oldProduct.setProductName(p.getProductName());
        oldProduct.setDescription(p.getDescription());
        oldProduct.setPrice(p.getPrice());
        oldProduct.setStatus(p.getStatus());


        return productRepo.save(oldProduct);
    }

}
