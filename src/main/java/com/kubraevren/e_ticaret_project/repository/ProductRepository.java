package com.kubraevren.e_ticaret_project.repository;

import com.kubraevren.e_ticaret_project.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
