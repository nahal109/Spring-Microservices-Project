package com.project.organizationservice.controller;

import com.project.organizationservice.dto.OrganizationDto;
import com.project.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organizations")

public class OrganizationController {
    private final OrganizationService organizationService;
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    public ResponseEntity<OrganizationDto> saveOrganization(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto saveOrganizationDto = organizationService.saveOrganization(organizationDto);
        return new ResponseEntity<>(saveOrganizationDto, HttpStatus.CREATED);
    }

    @GetMapping("{code}")
    public ResponseEntity<OrganizationDto> getOrganization(@PathVariable ("code") String organizationCode) {
        OrganizationDto saveOrganizationDto = organizationService.getOrganization(organizationCode);
        return ResponseEntity.ok(saveOrganizationDto);
    }
}
