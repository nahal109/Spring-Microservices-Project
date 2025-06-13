package com.spring_microservise.employee_service.repo;

import com.spring_microservise.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Employee findAllById(long Id);
}
