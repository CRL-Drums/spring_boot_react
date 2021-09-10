package com.spring.react.desvendas.services;

import java.util.List;

import com.spring.react.desvendas.dto.SaleDTO;
import com.spring.react.desvendas.dto.SaleSumDTO;
import com.spring.react.desvendas.dto.SalesSuccessDTO;
import com.spring.react.desvendas.entities.Sale;
import com.spring.react.desvendas.repositories.SaleRepository;
import com.spring.react.desvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
