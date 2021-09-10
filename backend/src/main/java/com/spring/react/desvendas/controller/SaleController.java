package com.spring.react.desvendas.controller;


import java.util.List;

import com.spring.react.desvendas.dto.SaleDTO;
import com.spring.react.desvendas.dto.SaleSumDTO;
import com.spring.react.desvendas.dto.SalesSuccessDTO;
import com.spring.react.desvendas.services.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    
    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> listDto = service.findAll(pageable);
        return ResponseEntity.ok(listDto);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        List<SaleSumDTO> listDto = service.amountGroupedBySeller();
        return ResponseEntity.ok(listDto);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SalesSuccessDTO>> successGroupedBySeller() {
        List<SalesSuccessDTO> listDto = service.successGroupedBySeller();
        return ResponseEntity.ok(listDto);
    }
}
