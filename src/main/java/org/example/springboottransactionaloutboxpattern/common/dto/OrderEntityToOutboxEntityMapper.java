package org.example.springboottransactionaloutboxpattern.common.dto;

import org.example.springboottransactionaloutboxpattern.entity.Order;
import org.example.springboottransactionaloutboxpattern.entity.Outbox;
import org.springframework.stereotype.Component;

@Component
public class OrderEntityToOutboxEntityMapper {

    public Outbox map(Order order) {
        return Outbox.builder().aggregateId(order.getId()).payload(order.toString()).createdAt(new Date()).processed(false).build();
    }
}
