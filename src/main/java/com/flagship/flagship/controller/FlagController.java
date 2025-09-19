package com.flagship.flagship.controller;

import com.flagship.flagship.model.Flag;
import com.flagship.flagship.repository.FlagRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/flags")
public class FlagController {

    private final FlagRepository flagRepository;

    public FlagController(FlagRepository flagRepository) {
        this.flagRepository = flagRepository;
    }

    // Create a new flag
    @PostMapping
    public Flag createFlag(@RequestBody Flag flag) {
        return flagRepository.save(flag);
    }

    // List all flags
    @GetMapping
    public List<Flag> listFlags() {
        return flagRepository.findAll();
    }

    // Get flag by id
    @GetMapping("/{id}")
    public Optional<Flag> getFlag(@PathVariable Long id) {
        return flagRepository.findById(id);
    }

    // Toggle flag enabled/disabled
    @PostMapping("/{id}/toggle")
    public Flag toggleFlag(@PathVariable Long id) {
        Flag flag = flagRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Flag not found"));
        flag.setEnabled(!flag.getEnabled());
        return flagRepository.save(flag);
    }
}