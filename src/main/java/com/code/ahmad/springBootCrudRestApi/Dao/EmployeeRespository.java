package com.code.ahmad.springBootCrudRestApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

@RepositoryRestResource(path="members")
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
