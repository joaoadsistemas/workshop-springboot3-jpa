package com.joaosilveira.course.repositories;

import com.joaosilveira.course.entities.Category;
import com.joaosilveira.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Nao precisa colocar o @Repository pois a classe já esta herdando o JPARepository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
