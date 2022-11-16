package com.mustache.springbootmustache.repository;

import com.mustache.springbootmustache.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
