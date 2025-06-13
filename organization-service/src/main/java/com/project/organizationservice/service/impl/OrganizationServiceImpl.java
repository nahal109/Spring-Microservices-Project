package com.project.organizationservice.service.impl;

import com.project.organizationservice.dto.OrganizationDto;
import com.project.organizationservice.entity.Organization;
import com.project.organizationservice.mapper.OrganizationMapper;
import com.project.organizationservice.repo.OrganizationRepo;
import com.project.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepo organizationRepo;


    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = OrganizationMapper.mapOrganization(organizationDto);
        Organization savedOrganization = organizationRepo.save(organization);

        OrganizationDto organizationDtos = OrganizationMapper.mapOrganizationDto(savedOrganization);
        return organizationDtos;
    }

    @Override
    public OrganizationDto getOrganization(String organizationCode) {
        Organization organization = organizationRepo.findByOrganizationCode(organizationCode);
        OrganizationDto organizationDtos = OrganizationMapper.mapOrganizationDto(organization);
        return organizationDtos;
    }
}
