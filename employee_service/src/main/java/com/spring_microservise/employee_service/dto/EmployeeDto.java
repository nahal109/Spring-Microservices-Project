package com.spring_microservise.employee_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDto {
    private Long id;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String firstname, String lastname, String email, String departmentCode, String organizationCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.departmentCode = departmentCode;
        this.organizationCode = organizationCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    private String firstname;
    private String lastname;
    private String email;
    private String departmentCode;
    private String organizationCode;
}
