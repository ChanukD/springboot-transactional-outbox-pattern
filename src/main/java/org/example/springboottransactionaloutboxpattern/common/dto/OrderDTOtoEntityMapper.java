package org.example.springboottransactionaloutboxpattern.common.dto;

import org.example.springboottransactionaloutboxpattern.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDTOtoEntityMapper {

    public Order map(OrderRequestDTO orderRequestDTO) {
        return Order.builder().customerId(orderRequestDTO.getCustomerId()).name(orderRequestDTO.getName()).productType(orderRequestDTO.getProductType()).quantity(orderRequestDTO.getQuantity()).price(orderRequestDTO.getPrice()).build();
    }
}
