package org.example.LLD.RideSharingApplication.entities;

import org.example.LLD.RideSharingApplication.enums.Feature;

public class RideRequest {
    private User requestedUser;
    private String source;
    private String destination;
    private Feature feature;
    private int seatsRequest;

    public User getRequestedUser() {
        return requestedUser;
    }

    public void setRequestedUser(User requestedUser) {
        this.requestedUser = requestedUser;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    public int getSeatsRequest() {
        return seatsRequest;
    }

    public void setSeatsRequest(int seatsRequest) {
        this.seatsRequest = seatsRequest;
    }

    public RideRequest(User requestedUser, String source, String destination, Feature feature) {
        this.requestedUser = requestedUser;
        this.source = source;
        this.destination = destination;
        this.feature = feature;
    }

    public RideRequest(User requestedUser, String source, String destination, int seatsRequest, Feature feature) {
        this.requestedUser = requestedUser;
        this.source = source;
        this.destination = destination;
        this.feature = feature;
        this.seatsRequest = seatsRequest;
    }
}
