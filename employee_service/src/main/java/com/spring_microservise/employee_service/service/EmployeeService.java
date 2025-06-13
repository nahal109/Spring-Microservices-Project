package com.spring_microservise.employee_service.service;

import com.spring_microservise.employee_service.dto.APIResponseDto;
import com.spring_microservise.employee_service.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(long id);
}
