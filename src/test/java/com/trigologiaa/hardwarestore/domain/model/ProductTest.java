package com.trigologiaa.hardwarestore.domain.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ProductTest {
  private static final Long VALID_CODE = 12345L;
  private static final String VALID_NAME = "Hammer Drill";
  private static final String VALID_BRAND = "DeWalt";
  private static final String VALID_CATEGORY = "Power Tools";
  private static final Double VALID_PRICE = 159.99;
  private static final Integer VALID_STOCK = 25;
  private static final String VALID_DESCRIPTION = "20V drill with lithium battery";

  @Test
  void productWithoutArgumentsShouldBeCreatedCorrectly() {
    Product product = new Product();
    assertNotNull(product, "The product initialized without arguments must not be null");
  }

  @Test
  void productWithArgumentsShouldBeCreatedCorrectly() {
    Product product = new Product(
            VALID_CODE,
            VALID_NAME,
            VALID_BRAND,
            VALID_CATEGORY,
            VALID_PRICE,
            VALID_STOCK,
            VALID_DESCRIPTION
    );
    assertNotNull(product, "The product initialized with arguments must not be null");
  }

  @Test
  void productWithNegativeCodeShouldThrowAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    -1L,
                    VALID_NAME,
                    VALID_BRAND,
                    VALID_CATEGORY,
                    VALID_PRICE,
                    VALID_STOCK,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithEmptyNameShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    "",
                    VALID_BRAND,
                    VALID_CATEGORY,
                    VALID_PRICE,
                    VALID_STOCK,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithEmptyBrandShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    VALID_NAME,
                    "",
                    VALID_CATEGORY,
                    VALID_PRICE,
                    VALID_STOCK,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithEmptyCategoryShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    VALID_NAME,
                    VALID_BRAND,
                    "",
                    VALID_PRICE,
                    VALID_STOCK,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithNegativePriceShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    VALID_NAME,
                    VALID_BRAND,
                    VALID_CATEGORY,
                    -1.0,
                    VALID_STOCK,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithNegativeStockShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    VALID_NAME,
                    VALID_BRAND,
                    VALID_CATEGORY,
                    VALID_PRICE,
                    -1,
                    VALID_DESCRIPTION
            )
    );
  }

  @Test
  void productWithEmptyDescriptionShouldThrownAnException() {
    assertThrows(IllegalArgumentException.class, () -> new Product(
                    VALID_CODE,
                    VALID_NAME,
                    VALID_BRAND,
                    VALID_CATEGORY,
                    VALID_PRICE,
                    VALID_STOCK,
                    ""
            )
    );
  }
}