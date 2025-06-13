package com.spring_microservise.employee_service.service.impl;

import com.spring_microservise.employee_service.dto.APIResponseDto;
import com.spring_microservise.employee_service.dto.DepartmentDto;
import com.spring_microservise.employee_service.dto.EmployeeDto;
import com.spring_microservise.employee_service.dto.OrganizationDto;
import com.spring_microservise.employee_service.entity.Employee;
import com.spring_microservise.employee_service.repo.EmployeeRepo;
import com.spring_microservise.employee_service.service.APIClient;
import com.spring_microservise.employee_service.service.EmployeeService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class EmployeeImpl implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeImpl.class);

    private final EmployeeRepo employeeRepo;
    public EmployeeImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    //    @Autowired
//    private RestTemplate restTemplate;
//
    @Autowired
    private WebClient webClient;

//    @Autowired
//    private APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstname(),
                employeeDto.getLastname(),
                employeeDto.getEmail(),
                employeeDto.getDepartmentCode(),
                employeeDto.getOrganizationCode()
        );
        Employee savedEmployee = employeeRepo.save(employee);
        return new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstname(),
                savedEmployee.getLastname(),
                savedEmployee.getEmail(),
                savedEmployee.getDepartmentCode(),
                savedEmployee.getOrganizationCode()
        );
    }

//     @CircuitBreaker(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
     @Retry(name = "${spring.application.name}", fallbackMethod = "getDefaultDepartment")
     @Override
    public APIResponseDto getEmployeeById(long id) {
        logger.info("inside getEmployeeById Method");
        Employee employee = employeeRepo.findAllById(id);

//        <<-- using rest-template for communication -->>
//        ResponseEntity<DepartmentDto> responseEntity =  restTemplate.
//                getForEntity("http://localhost:8080/api/departments/" + employee.getDepartmentCode(),
//                DepartmentDto.class);
//        DepartmentDto departmentDto = responseEntity.getBody();

//        <<-- using web-client for communication -->>
        DepartmentDto departmentDto =  webClient.get()
                .uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
                .retrieve()
                .bodyToMono(DepartmentDto.class)
                .block();

         OrganizationDto organizationDto =  webClient.get()
                 .uri("http://localhost:8083/api/organizations/" + employee.getOrganizationCode())
                 .retrieve()
                 .bodyToMono(OrganizationDto.class)
                 .block();

//        <<-- using spring cloud FeignClient for communication -->>
//        DepartmentDto departmentDto = apiClient.getDepartment(employee.getDepartmentCode());


        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getDepartmentCode(),
                employee.getOrganizationCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);
        apiResponseDto.setOrganizationDto(organizationDto);
        return apiResponseDto;
    }

    public APIResponseDto getDefaultDepartment(long id, Exception e) {
        logger.info("inside getDefaultDepartment Method");
        Employee employee = employeeRepo.findAllById(id);

//        <<-- using web-client for communication -->>
        DepartmentDto departmentDto =  new DepartmentDto();
        departmentDto.setDepartmentName("Default Department");
        departmentDto.setDepartmentCode("D-001");
        departmentDto.setDepartmentDescription("Default IT Department");

        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getDepartmentCode(),
                employee.getOrganizationCode()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);

        return apiResponseDto;
    }
}
