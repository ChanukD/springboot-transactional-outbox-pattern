package org.example.springboottransactionaloutboxpattern.service;

import org.example.springboottransactionaloutboxpattern.common.dto.OrderDTOtoEntityMapper;
import org.example.springboottransactionaloutboxpattern.common.dto.OrderRequestDTO;
import org.example.springboottransactionaloutboxpattern.entity.Order;
import org.example.springboottransactionaloutboxpattern.entity.Outbox;
import org.example.springboottransactionaloutboxpattern.repository.OrderRepository;
import org.example.springboottransactionaloutboxpattern.repository.OutboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDTOtoEntityMapper orderDTOtoEntityMapper;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OutboxRepository outboxRepository;

    public Order createOrder(OrderRequestDTO orderRequestDTO) {
        Order order = orderDTOtoEntityMapper.map(orderRequestDTO);
        order = orderRepository.save(order);

        outboxRepository.save();

        return order;
    }
}
