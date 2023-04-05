package com.bsolution.activosinformacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bsolution.activosinformacion.entity.LeyFundamento;

@Transactional
public interface LeyFundamentoRepository extends JpaRepository<LeyFundamento, Integer>{

}
