package com.spring.react.desvendas.dto;

import java.time.LocalDate;

import com.spring.react.desvendas.entities.Sale;

import lombok.Data;

@Data
public class SaleDTO {
    
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;
    
    private SellerDTO seller;

    public SaleDTO() {

    }

    public SaleDTO(Sale entity) {
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }

}