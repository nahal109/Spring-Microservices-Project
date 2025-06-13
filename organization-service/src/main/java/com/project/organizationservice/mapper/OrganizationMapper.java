package com.project.organizationservice.mapper;

import com.project.organizationservice.dto.OrganizationDto;
import com.project.organizationservice.entity.Organization;

public class OrganizationMapper {
    public static OrganizationDto mapOrganizationDto(Organization organization) {
        OrganizationDto organizationDto = new OrganizationDto(
                organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationDescription(),
                organization.getOrganizationCode(),
                organization.getCreateDate()
        );
        return organizationDto;
    }

    public static Organization mapOrganization(OrganizationDto organizationDto) {
        Organization organization = new Organization(
                organizationDto.getId(),
                organizationDto.getOrganizationName(),
                organizationDto.getOrganizationDescription(),
                organizationDto.getOrganizationCode(),
                organizationDto.getCreateDate()
        );
        return organization;
    }
}
