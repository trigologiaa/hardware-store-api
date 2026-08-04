package com.trigologiaa.hardwarestore.domain.model;

import org.jspecify.annotations.NonNull;
import org.springframework.util.StringUtils;

/**
 * Represents a product available in the hardware store.
 *
 * <p>Contains all the essential details of a product, including its identification, classification,
 * pricing, and stock availability.
 */
public class Product {
  private Integer code;
  private String name;
  private String brand;
  private String category;
  private Double price;
  private Integer stock;
  private String description;

  /**
   * Constructs an empty {@code Product}.
   */
  public Product() {
  }

  /**
   * Constructs a new {@code Product} with the specified details.
   *
   * @param code        the unique identifier code for the product
   * @param name        the name of the product
   * @param brand       the brand of the product
   * @param category    the category classification of the product
   * @param price       the monetary price of the product
   * @param stock       the available quantity in inventory
   * @param description a brief description of the product features
   */
  public Product(
          Integer code,
          String name,
          String brand,
          String category,
          Double price,
          Integer stock,
          String description
  ) {
    this.setCode(code);
    this.setName(name);
    this.setBrand(brand);
    this.setCategory(category);
    this.setPrice(price);
    this.stock = stock;
    this.description = description;
  }

  /**
   * Sets and validates the product code.
   *
   * <p>Ensures that the assigned code is a positive integer or zero
   *
   * @param code the code to be assigned to this product
   * @throws IllegalArgumentException if the code is negative
   */
  private void setCode(@NonNull Integer code) {
    if (code < 0) {
      throw new IllegalArgumentException("The product code must not be negative.");
    }
    this.code = code;
  }

  /**
   * Sets and validates the product name.
   *
   * <p>Ensures that the assigned name is not blank or composed only of whitespaces.
   *
   * @param name the name to be assigned to this product
   * @throws IllegalArgumentException if the provided name is blank
   */
  private void setName(@NonNull String name) {
    if (!StringUtils.hasText(name)) {
      throw new IllegalArgumentException("The product name must not be empty.");
    }
    this.name = name;
  }

  /**
   * Sets and validates the product brand.
   *
   * <p>Ensures that the assigned brand is not blank or composed only of whitespaces.
   *
   * @param brand the brand to be assigned to this product
   * @throws IllegalArgumentException if the provided brand is blank
   */
  private void setBrand(@NonNull String brand) {
    if (!StringUtils.hasText(brand)) {
      throw new IllegalArgumentException("The product brand must not be empty.");
    }
    this.brand = brand;
  }

  /**
   * Sets and validates the product category.
   *
   * <p>Ensures that the assigned category is not blank or comopsed only of whitespaces.
   *
   * @param category the category to be assigned to this product
   * @throws IllegalArgumentException if the provided category is blank or null
   */
  private void setCategory(@NonNull String category) {
    if (!StringUtils.hasText(category)) {
      throw new IllegalArgumentException("The product description must not be empty.");
    }
    this.category = category;
  }

  /**
   * Sets and validates the product price.
   *
   * <p>Ensures that the assigned price is greater than zero.
   *
   * @param price the monetary price to be assigned to this product
   * @throws IllegalArgumentException if the price is negative
   */
  private void setPrice(@NonNull Double price) {
    if (price < 0.0) {
      throw new IllegalArgumentException("The product price must not be empty.");
    }
    this.price = price;
  }
}