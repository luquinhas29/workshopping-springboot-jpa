package com.devlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
