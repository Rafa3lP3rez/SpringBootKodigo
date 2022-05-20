package com.proyecto.repository;

import com.proyecto.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@CrossOrigin(value = "*")
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM PRODUCT", nativeQuery = true)
    List<Product> selectProductProcedure();

    @Query(value = "{call selectProductByIdProcedure}", nativeQuery = true)
    Product selectProductByIdProcedure(@RequestParam("id") Long id);

    @Query(value = "{call selectSaveProcedure(:product_name, :product_brand, :product_quantity, :product_price)}", nativeQuery = true)
    void saveProductProcedure(
            @RequestParam("product_name") String productName,
            @RequestParam("product_brand") String productBrand,
            @RequestParam("product_quantity") Integer productQuantity,
            @RequestParam("product_price") Float productPrice
    );


}
