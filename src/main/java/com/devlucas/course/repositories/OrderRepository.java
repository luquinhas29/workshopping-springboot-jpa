package com.devlucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
