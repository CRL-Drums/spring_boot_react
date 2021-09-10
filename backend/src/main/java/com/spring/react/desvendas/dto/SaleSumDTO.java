package com.spring.react.desvendas.dto;

import java.io.Serializable;

import com.spring.react.desvendas.entities.Seller;

import lombok.Data;

@Data
public class SaleSumDTO implements Serializable{
    
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}