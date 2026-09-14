package com.kubraevren.e_ticaret_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDtoUI {
    private UUID id;
    private String name;
    private BigDecimal price;
    private Integer stockQuantity;
}
