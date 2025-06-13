package com.project.organizationservice.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "organization")

public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationDescription() {
        return organizationDescription;
    }

    public void setOrganizationDescription(String organizationDescription) {
        this.organizationDescription = organizationDescription;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }


    public Organization(long id, String organizationName, String organizationDescription, String organizationCode , LocalDateTime createDate) {
        this.id = id;
        this.organizationName = organizationName;
        this.organizationDescription = organizationDescription;
        this.organizationCode = organizationCode;
        this.createDate = createDate;
    }

    public Organization() {
    }

    @CreationTimestamp
    private LocalDateTime createDate;
}
