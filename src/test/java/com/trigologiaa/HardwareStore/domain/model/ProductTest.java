package com.trigologiaa.HardwareStore.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductTest {
    @Test
    void anEmptyProductShouldBeCreatedCorrectly() {
        Product product = new Product();
        assertNotNull(product, "The product initialized without arguments must not be null");
    }

    @Test
    void aProductWithArgumentsShouldBeCreatedCorrectly() {
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
}