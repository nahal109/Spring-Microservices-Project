package com.spring_microservise.employee_service.service;

import com.spring_microservise.employee_service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080", value = "DEPARTMENT-SERVICE")
//@FeignClient(name = "DEPARTMENT-SERVICE")

public interface APIClient {
    @GetMapping("/api/departments/{department-Code}")
    DepartmentDto getDepartment(@PathVariable("department-Code") String departmentCode);

}
