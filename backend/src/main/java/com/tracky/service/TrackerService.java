package com.tracky.service;

import com.tracky.dto.request.CreateTrackerRequest;
import com.tracky.dto.response.TrackerResponse;

public interface TrackerService {
    TrackerResponse createTracker(CreateTrackerRequest request);
}