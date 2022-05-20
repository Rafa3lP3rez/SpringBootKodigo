package com.proyecto.restcontroller;


import com.proyecto.entity.Product;
import com.proyecto.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService){

        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        return productService.selectProductProcedure();
    }



}
