package com.devregianderson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devregianderson.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository <Sale, Long>{

}
