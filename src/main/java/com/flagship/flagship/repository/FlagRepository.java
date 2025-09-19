package com.flagship.flagship.repository;

import com.flagship.flagship.model.Flag;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface FlagRepository extends JpaRepository<Flag, Long> {
    Optional<Flag> findByKey(String key);
    List<Flag> findByEnvironmentId(Long environmentId);
}