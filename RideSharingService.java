package org.example.LLD.RideSharingApplication;

import org.example.LLD.RideSharingApplication.entities.*;
import org.example.LLD.RideSharingApplication.enums.Feature;
import org.example.LLD.RideSharingApplication.enums.Gender;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RideSharingService {
    int totalRides;
    List<Ride> avilableRidesList;
    List<User> users;
    int totalUsers;

    public RideSharingService() {
        this.totalRides = 0;
        this.totalUsers = 0;
        this.avilableRidesList = new LinkedList<>();
        this.users = new LinkedList<>();
    }

    public void offerRide(User offeredBy, String source, String destination, Vehicle vehicle, int availableSeats) throws Exception {
        boolean ridesAvailable = checkIfActiveAvailableRides(offeredBy);
        if (ridesAvailable) {
            throw new Exception("You already offered a ride");
        }
        Ride ride = new Ride(source, destination, offeredBy, availableSeats, vehicle);
        ride.setRideId(totalRides+1);
        avilableRidesList.add(ride);
        totalRides ++;
    }

    public User addUserToSystem(String name, Gender gender, int age, List<Vehicle> vehicles) {
        User user = null;
        if (vehicles == null || vehicles.isEmpty()) {
            user = new User(totalUsers+1, name, gender, age);
        } else {
            user = new RideOfferUsers(totalUsers+1, name, gender, age, vehicles);
        }
        users.add(user);
        this.totalUsers ++;
        return user;
    }

    private boolean checkIfActiveAvailableRides(User offeredBy) {
        Optional<Ride> ride =  avilableRidesList.stream().filter(ride1 -> ride1.getRideOfferedBy().equals(offeredBy)).findAny();
        return ride.isPresent();
    }


    public List<Ride> searchRide(RideRequest request1) {
        return this.avilableRidesList.stream().filter(ride ->
                    ride.getOrigin().equals(request1.getSource())
                    && ride.getDestination().equals(request1.getDestination())
                    && (request1.getFeature() != null ? getFeatureMatch(request1, ride) : true)
                    && ride.getAvailableSeats() == request1.getSeatsRequest()

        ).collect(Collectors.toList());
    }

    private boolean getFeatureMatch(RideRequest rideRequest, Ride ride) {
        switch (rideRequest.getFeature()) {
            case SPACIOUS:
                return rideRequest.getSeatsRequest() < ride.getAvailableSeats();
        }
        return false;
    }
}
