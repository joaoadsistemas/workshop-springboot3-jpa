package com.joaosilveira.course.repositories;

import com.joaosilveira.course.entities.OrderItem;
import com.joaosilveira.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Nao precisa colocar o @Repository pois a classe já esta herdando o JPARepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
