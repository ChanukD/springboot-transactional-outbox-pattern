package org.example.springboottransactionaloutboxpattern.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDTO {
    private String customerId;
    private String name;
    private String productType;
    private int quantity;
    private BigDecimal price;

}
