package com.khpi.economic.repository;

import com.khpi.economic.entity.SystemType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SystemTypeRepository extends CrudRepository<SystemType, Integer> {

    List<SystemType> findAll();

}