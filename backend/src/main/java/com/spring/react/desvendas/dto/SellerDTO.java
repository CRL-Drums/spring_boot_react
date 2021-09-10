package com.spring.react.desvendas.dto;

import java.io.Serializable;

import com.spring.react.desvendas.entities.Seller;

import lombok.Data;

@Data
public class SellerDTO implements Serializable{
    
    private Long id;
    private String name;

    
    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
