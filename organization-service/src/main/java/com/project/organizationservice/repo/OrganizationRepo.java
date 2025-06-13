package com.project.organizationservice.repo;

import com.project.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories

public interface OrganizationRepo extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
