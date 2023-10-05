package com.joaosilveira.course.repositories;

import com.joaosilveira.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
