package com.vegasabas.springbootdemo.repository;

import com.vegasabas.springbootdemo.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends IGenericRepository<EmployeeEntity,String>{
}
