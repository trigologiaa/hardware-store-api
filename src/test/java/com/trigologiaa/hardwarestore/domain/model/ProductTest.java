package com.trigologiaa.hardwarestore.domain.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ProductTest {
  @Test
  void productWithoutArgumentsShouldBeCreatedCorrectly() {
    Product product = new Product();
    assertNotNull(product, "The product initialized without arguments must not be null");
  }

  @Test
  void productWithArgumentsShouldBeCreatedCorrectly() {
    Product product = new Product(
            12345,
            "Hammer Drill",
            "DeWalt",
            "Power Tools",
            159.99,
            25,
            "20V drill with lithium battery"
    );
    assertNotNull(product, "The product initialized with arguments must not be null");
  }

  @Test
  void productWithNegativeCodeShouldThrowAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    -12345,
                    "Hammer Drill",
                    "DeWalt",
                    "Power Tools",
                    159.99,
                    25,
                    "20V drill with lithium battery"
            )
    );
  }

  @Test
  void productWithEmptyNameShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    12345,
                    "",
                    "DeWalt",
                    "Power Tools",
                    159.99,
                    25,
                    "20V drill with lithium battery"
            )
    );
  }

  @Test
  void productWithEmptyBrandShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    12345,
                    "Hammer Drill",
                    "",
                    "Power Tools",
                    159.99,
                    25,
                    "20V drill with lithium battery"
            )
    );
  }

  @Test
  void productWithEmptyCategoryShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    12345,
                    "Hammer Drill",
                    "DeWalt",
                    "",
                    159.99,
                    25,
                    "20V drill with lithium battery"
            )
    );
  }
}