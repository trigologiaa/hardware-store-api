package com.trigologiaa.HardwareStore.domain.model;

public class Product {
    private Integer code;
    private String name;
    private String brand;
    private String category;
    private Double price;
    private Integer stock;
    private String description;

    public Product() {
    }

    public Product(Integer code, String name, String brand, String category, Double price, Integer stock, String description) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
}
