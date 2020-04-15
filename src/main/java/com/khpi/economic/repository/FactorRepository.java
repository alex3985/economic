package com.khpi.economic.repository;

import com.khpi.economic.entity.CoefficientComplexityProduction;
import com.khpi.economic.entity.Factor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FactorRepository extends CrudRepository<Factor, Integer> {

    List<Factor> findAll();

}