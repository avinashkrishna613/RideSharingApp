package org.example.LLD.RideSharingApplication;

import org.example.LLD.RideSharingApplication.entities.*;
import org.example.LLD.RideSharingApplication.enums.Feature;
import org.example.LLD.RideSharingApplication.enums.Gender;
import org.example.LLD.RideSharingApplication.enums.VehicleTypes;

import java.util.LinkedList;
import java.util.List;

public class RideSharingAppRunner {
    public static void main(String[] args) throws Exception {
        RideSharingService rideSharingService = new RideSharingService();


        // creating vehicles for the users
        Vehicle vehicle = new Vehicle("Swift", "KA-01-12345", "barcode1", VehicleTypes.CAR);
        Vehicle vehicle1 = new Vehicle("Baleno", "TS-05-62395", "barcode2", VehicleTypes.CAR);
        Vehicle vehicle2 = new Vehicle("Polo", "KA-05-41491", "barcode3", VehicleTypes.CAR);
        Vehicle vehicle3 = new Vehicle("Activa", "KA-12-12332", "barcode4", VehicleTypes.ACTIVA);
        Vehicle vehicle4 = new Vehicle("XUV", "KA-05-1234", "barcode5", VehicleTypes.TRUCK);

        // creating users
        List<Vehicle> rohanVehicles = new LinkedList<>();
        rohanVehicles.add(vehicle);
        User rohan = rideSharingService.addUserToSystem("Rohan", Gender.MALE, 36, rohanVehicles);

        List<Vehicle> shashankVehicles = new LinkedList<>();
        shashankVehicles.add(vehicle1);
        User shashank = rideSharingService.addUserToSystem("Shashank", Gender.MALE, 29, shashankVehicles);

        List<Vehicle> shipraVehicles = new LinkedList<>();
        shipraVehicles.add(vehicle2);
        shipraVehicles.add(vehicle3);
        User shipra = rideSharingService.addUserToSystem("Shipra", Gender.FEMALE, 27, shipraVehicles);

        List<Vehicle> rahulVehicles = new LinkedList<>();
        rahulVehicles.add(vehicle4);
        User rahul = rideSharingService.addUserToSystem("Rahul", Gender.MALE, 29, rahulVehicles);

        User nandini = rideSharingService.addUserToSystem("Nandini", Gender.FEMALE, 29, null);
        User gaurav = rideSharingService.addUserToSystem("Gaurav", Gender.MALE, 29, null);

        // create ride offers
        rideSharingService.offerRide(rohan, "Hyderabad", "Bangalore", vehicle, 1);
        rideSharingService.offerRide(shipra, "Bangalore", "Mysore", vehicle3, 1);
//        rideSharingService.offerRide(shipra, "Bangalore", "Mysore", vehicle2, 2);
        rideSharingService.offerRide(shashank, "Hyderabad", "Bangalore", vehicle1, 2);
        rideSharingService.offerRide(rahul, "Hyderabad", "Bangalore", vehicle4, 5);

        // user searching for rides
        RideRequest request1 = new RideRequest(nandini, "Bangalore", "Mysore", 1,  Feature.SPACIOUS);
        List<Ride> avilableRides1 = rideSharingService.searchRide(request1);
        if (avilableRides1 == null || avilableRides1.isEmpty()) {
            System.out.println("No rides available");
        } else {
            for (Ride ride : avilableRides1) {
                System.out.println(ride);
            }
        }

        RideRequest request2 = new RideRequest(gaurav, "Bangalore", "Mysore", 1,  null);
        List<Ride> avilableRides2 = rideSharingService.searchRide(request2);
        if (avilableRides2 == null || avilableRides2.isEmpty()) {
            System.out.println("No rides available");
        } else {
            for (Ride ride : avilableRides2) {
                System.out.println(ride);
            }
        }

    }
}
