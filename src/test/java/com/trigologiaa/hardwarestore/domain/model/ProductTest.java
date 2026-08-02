package com.trigologiaa.hardwarestore.domain.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.trigologiaa.hardwarestore.domain.exception.NegativeCodeProductException;
import org.junit.jupiter.api.Test;

class ProductTest {
  @Test
  void productWithoutArgumentsShouldBeCreatedCorrectly() {
    Product product = new Product();
    assertNotNull(product, "The product initialized without arguments must not be null");
  }

  @Test
  void productWithArgumentsShouldBeCreatedCorrectly() {
    Product fullProduct = new Product(
            12345,
            "Hammer Drill",
            "DeWalt",
            "Power Tools",
            159.99,
            25,
            "20V drill with lithium battery"
    );
    assertNotNull(fullProduct, "The product initialized with arguments must not be null");
  }

  @Test
  void productWithNegativeCodeShouldThrowAnException() {
    assertThrows(NegativeCodeProductException.class, () -> new Product(
            -12345,
            "Hammer Drill",
            "DeWalt",
            "Power Tools",
            159.99,
            25,
            "20V drill with lithium battery"));
  }
}