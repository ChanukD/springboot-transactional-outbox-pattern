package org.example.springboottransactionaloutboxpattern.repository;

import org.example.springboottransactionaloutboxpattern.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
