package com.flagship.flagship.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class FlagRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // e.g., "percentage_rollout", "user_attribute"
    private String value; // e.g., "50" for 50% rollout

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne
    private Flag flag;

    // getters and setters
}
