package com.trigologiaa.hardwarestore.domain.model;

import com.trigologiaa.hardwarestore.domain.exception.NegativeCodeProductException;

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
   * @throws NegativeCodeProductException if the provided code is less than zero
   */
  public Product(
          Integer code,
          String name,
          String brand,
          String category,
          Double price,
          Integer stock,
          String description
  ) throws NegativeCodeProductException {
    this.setCode(code);
    this.name = name;
    this.brand = brand;
    this.category = category;
    this.price = price;
    this.stock = stock;
    this.description = description;
  }

  /**
   * Sets and validates the product code.
   *
   * <p>Ensures that the assigned code is a positive integer or zero
   *
   * @param code the code to be assigned to this product
   * @throws NegativeCodeProductException if the code is negative
   */
  private void setCode(Integer code) {
    if (code < 0) {
      throw new NegativeCodeProductException("The product code must not be negative.");
    }
    this.code = code;
  }
}