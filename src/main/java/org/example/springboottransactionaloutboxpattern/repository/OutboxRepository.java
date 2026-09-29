package org.example.springboottransactionaloutboxpattern.repository;

import org.example.springboottransactionaloutboxpattern.entity.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboxRepository extends JpaRepository<Outbox, Long> {
}
