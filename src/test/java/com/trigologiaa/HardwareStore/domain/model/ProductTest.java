package com.trigologiaa.HardwareStore.domain.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductTest {
    @Test
    void anEmptyProductShouldBeCreatedCorrectly() {
        Product product = new Product();
        assertNotNull(product, "The product initialized without arguments must not be null");
    }
}