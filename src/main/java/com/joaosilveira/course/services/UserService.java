package com.joaosilveira.course.services;

import com.joaosilveira.course.entities.User;
import com.joaosilveira.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Com o @Service agora é possivel que ele possa ser injetado com o @Autowired, pois ele pertence ao Spring
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }


}