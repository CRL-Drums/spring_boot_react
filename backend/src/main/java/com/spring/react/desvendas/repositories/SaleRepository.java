package com.spring.react.desvendas.repositories;

import java.util.List;

import com.spring.react.desvendas.dto.SaleSumDTO;
import com.spring.react.desvendas.dto.SalesSuccessDTO;
import com.spring.react.desvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.spring.react.desvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " 
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.spring.react.desvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " 
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SalesSuccessDTO> successGroupedBySeller();
}
