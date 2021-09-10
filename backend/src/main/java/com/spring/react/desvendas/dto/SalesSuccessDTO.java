package com.spring.react.desvendas.dto;

import java.io.Serializable;

import com.spring.react.desvendas.entities.Seller;

import lombok.Data;

@Data
public class SalesSuccessDTO implements Serializable{
    
    private String sellerName;
    private Long visited;
    private Long deals;

    public SalesSuccessDTO(Seller seller, Long visited, Long deals) {
        sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}