package com.yash.repository;

import org.springframework.stereotype.Repository;

import com.yash.ems.model.Employee;

import org.springframework.data.repository.CrudRepository;


@Repository("employeerepository")
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
