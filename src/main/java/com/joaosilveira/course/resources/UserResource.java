package com.joaosilveira.course.resources;


import com.joaosilveira.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findALl() {
        User u = new User(1L, "Maria", "maria@gmail.com", "999999", "21456");
        return ResponseEntity.ok().body(u);
    }


}