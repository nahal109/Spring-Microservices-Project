package com.project.organizationservice.service;

import com.project.organizationservice.dto.OrganizationDto;

public interface OrganizationService {
    OrganizationDto saveOrganization(OrganizationDto organizationDto);

    OrganizationDto getOrganization(String organizationCode);
}
