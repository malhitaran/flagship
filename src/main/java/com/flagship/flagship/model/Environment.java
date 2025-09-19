package com.flagship.flagship.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Environment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g., dev, staging, prod

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy = "environment")
    private List<Flag> flags;

    // getters and setters
}
