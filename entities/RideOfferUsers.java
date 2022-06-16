package org.example.LLD.RideSharingApplication.entities;

import org.example.LLD.RideSharingApplication.enums.Gender;

import java.util.List;

public class RideOfferUsers extends  User{
    private List<Ride> previousSuccesfullyOfferedRides;
    private List<Vehicle> vehicleList;

    public RideOfferUsers(int id, String name, String email, String password, Gender gender, int age, List<Ride> previousSuccesfullyOfferedRides, List<Vehicle> vehicleList) {
        super(id, name, email, password, gender, age);
        this.previousSuccesfullyOfferedRides = previousSuccesfullyOfferedRides;
        this.vehicleList = vehicleList;
    }

    public RideOfferUsers(int id, String name, Gender gender, int age, List<Vehicle> vehicleList) {
        super(id, name, gender, age);
        this.vehicleList = vehicleList;
    }

    public List<Ride> getPreviousSuccesfullyOfferedRides() {
        return previousSuccesfullyOfferedRides;
    }

    public void setPreviousSuccesfullyOfferedRides(List<Ride> previousSuccesfullyOfferedRides) {
        this.previousSuccesfullyOfferedRides = previousSuccesfullyOfferedRides;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
