package com.proyecto.service;

import com.proyecto.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductService {


    List<Product> selectProductProcedure();

    Product selectProductByIdProcedure(Long id);

    void saveProductProcedure(String productName, String productBrand, Integer productQuantity, Float productPrice);

}
