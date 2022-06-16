package org.example.LLD.RideSharingApplication.entities;

import org.example.LLD.RideSharingApplication.entities.Ride;

public class Ride {
    private int rideId;
    private String origin;
    private String destination;
    private User rideOfferedBy;
    private int availableSeats;
    private Vehicle vehicle;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public User getRideOfferedBy() {
        return rideOfferedBy;
    }

    public void setRideOfferedBy(User rideOfferedBy) {
        this.rideOfferedBy = rideOfferedBy;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public Ride(String origin, String destination, User rideOfferedBy, int availableSeats, Vehicle vehicle) {
        this.origin = origin;
        this.destination = destination;
        this.rideOfferedBy = rideOfferedBy;
        this.availableSeats = availableSeats;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideId=" + rideId +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", rideOfferedBy=" + rideOfferedBy +
                ", availableSeats=" + availableSeats +
                ", vehicle=" + vehicle +
                '}';
    }
}
