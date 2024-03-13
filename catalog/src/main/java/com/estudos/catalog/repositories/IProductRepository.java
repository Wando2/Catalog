package com.estudos.catalog.repositories;

import com.estudos.catalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
