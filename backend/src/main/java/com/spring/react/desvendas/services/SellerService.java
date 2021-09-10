package com.spring.react.desvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.spring.react.desvendas.dto.SellerDTO;
import com.spring.react.desvendas.entities.Seller;
import com.spring.react.desvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result = repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
