package com.tracky.service.impl;

import com.tracky.dto.request.CreateTrackerRequest;
import com.tracky.dto.response.TrackerResponse;
import com.tracky.entity.Tracker;
import com.tracky.repository.TrackerRepository;
import com.tracky.service.TrackerService;
import org.springframework.stereotype.Service;

@Service
public class TrackerServiceImpl implements TrackerService {

    private final TrackerRepository trackerRepository;

    public TrackerServiceImpl(TrackerRepository trackerRepository) {
        this.trackerRepository = trackerRepository;
    }

    @Override
    public TrackerResponse createTracker(CreateTrackerRequest request) {

        Tracker tracker = new Tracker();

        tracker.setName(request.getName());
        tracker.setDescription(request.getDescription());
        tracker.setGraphType(request.getGraphType());

        Tracker savedTracker = trackerRepository.save(tracker);

        TrackerResponse response = new TrackerResponse();

        response.setId(savedTracker.getId());
        response.setName(savedTracker.getName());
        response.setDescription(savedTracker.getDescription());
        response.setGraphType(savedTracker.getGraphType());

        return response;
    }
}