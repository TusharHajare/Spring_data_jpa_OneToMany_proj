package com.Collaboration.Spring_data_jpa_OneToMany_proj.repository;

import com.Collaboration.Spring_data_jpa_OneToMany_proj.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
