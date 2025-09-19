package com.flagship.flagship.repository;

import com.flagship.flagship.model.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EnvironmentRepository extends JpaRepository<Environment, Long> {
    List<Environment> findByProjectId(Long projectId);
    Environment findByNameAndProjectId(String name, Long projectId);
}
