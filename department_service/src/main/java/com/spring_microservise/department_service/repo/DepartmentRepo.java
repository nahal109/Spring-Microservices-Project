package com.spring_microservise.department_service.repo;

import com.spring_microservise.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface DepartmentRepo extends JpaRepository<Department,Long> {
    Department findByDepartmentCode(String departmentCode);


}
