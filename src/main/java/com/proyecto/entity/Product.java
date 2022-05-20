package com.proyecto.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_brand")
    private String productBrand;

    @Column(name = "product_quantity")
    private Integer productQuantity;

    @Column(name = "product_price")
    private Float productPrice;


}
