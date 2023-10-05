package com.joaosilveira.course.services;

import com.joaosilveira.course.entities.Category;
import com.joaosilveira.course.entities.User;
import com.joaosilveira.course.repositories.CategoryRepository;
import com.joaosilveira.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Com o @Service agora é possivel que ele possa ser injetado com o @Autowired, pois ele pertence ao Spring
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }


}
