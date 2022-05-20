package com.proyecto.service;


import com.proyecto.entity.Product;
import com.proyecto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService{

    ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> selectProductProcedure() {
        return productRepository.selectProductProcedure();
    }

    @Override
    public Product selectProductByIdProcedure(Long id) {
        return productRepository.selectProductByIdProcedure(id);
    }

    @Override
    public void saveProductProcedure(String productName, String productBrand, Integer productQuantity, Float productPrice) {

        productRepository.saveProductProcedure(productName, productBrand, productQuantity, productPrice);
    }
}
