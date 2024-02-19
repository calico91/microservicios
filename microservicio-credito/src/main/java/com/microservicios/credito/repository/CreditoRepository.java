package com.microservicios.credito.repository;

import com.microservicios.credito.model.Credito;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditoRepository extends JpaRepository<Credito, Integer> {

    List<Credito> findByIdCliente(Integer idCliente);
}
