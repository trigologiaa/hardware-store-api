package com.trigologiaa.hardwarestore.infrastructure.adapter.out.db;

import com.trigologiaa.hardwarestore.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
