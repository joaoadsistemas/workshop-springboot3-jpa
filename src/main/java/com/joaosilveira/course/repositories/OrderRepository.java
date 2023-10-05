package com.joaosilveira.course.repositories;

import com.joaosilveira.course.entities.Order;
import com.joaosilveira.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Nao precisa colocar o @Repository pois a classe já esta herdando o JPARepository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
