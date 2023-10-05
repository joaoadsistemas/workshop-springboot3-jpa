package com.joaosilveira.course.services;

import com.joaosilveira.course.entities.Category;
import com.joaosilveira.course.entities.Order;
import com.joaosilveira.course.entities.Product;
import com.joaosilveira.course.repositories.CategoryRepository;
import com.joaosilveira.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Com o @Service agora é possivel que ele possa ser injetado com o @Autowired, pois ele pertence ao Spring
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }


}
