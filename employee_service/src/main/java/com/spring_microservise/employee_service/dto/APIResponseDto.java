package com.spring_microservise.employee_service.dto;

import org.springframework.data.domain.jaxb.SpringDataJaxb;

public class APIResponseDto {
    private EmployeeDto employeeDto;
    private DepartmentDto departmentDto;
    private OrganizationDto organizationDto;

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }

    public OrganizationDto getOrganizationDto() {
        return organizationDto;
    }
    public void setOrganizationDto(OrganizationDto organizationDto) {
        this.organizationDto = organizationDto;
    }

    public APIResponseDto(EmployeeDto employeeDto, DepartmentDto departmentDto, OrganizationDto organizationDto) {
        this.employeeDto = employeeDto;
        this.departmentDto = departmentDto;
        this.organizationDto = organizationDto;
    }

    public APIResponseDto() {
    }
}
