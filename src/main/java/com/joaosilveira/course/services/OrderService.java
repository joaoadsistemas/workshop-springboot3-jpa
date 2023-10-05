package com.joaosilveira.course.services;

import com.joaosilveira.course.entities.Order;
import com.joaosilveira.course.entities.User;
import com.joaosilveira.course.repositories.OrderRepository;
import com.joaosilveira.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Com o @Service agora é possivel que ele possa ser injetado com o @Autowired, pois ele pertence ao Spring
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }


}
