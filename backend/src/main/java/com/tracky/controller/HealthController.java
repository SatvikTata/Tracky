package com.tracky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tracky.repository.TrackerRepository;
import com.tracky.entity.Tracker;

@RestController
public class HealthController {


    private final TrackerRepository trackerRepository;

    public HealthController(TrackerRepository trackerRepository) {

        this.trackerRepository = trackerRepository;

    }

    @GetMapping("/health")
    public String health() {
        return "Tracky Backend Running";
    }

    @GetMapping("/test-save")

    public String saveTracker() {

        Tracker tracker = new Tracker();

        tracker.setName("Weight Tracker");

        tracker.setDescription("Track daily weight");

        tracker.setGraphType("LINE");

        trackerRepository.save(tracker);

        return "Saved it ";

    }
}