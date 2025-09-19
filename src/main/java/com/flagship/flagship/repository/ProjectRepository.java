package com.flagship.flagship.repository;

import com.flagship.flagship.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByTenantId(Long tenantId);
}
