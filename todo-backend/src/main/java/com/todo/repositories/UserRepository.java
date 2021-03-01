package com.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmailAndPassword(String email, String password);
}
