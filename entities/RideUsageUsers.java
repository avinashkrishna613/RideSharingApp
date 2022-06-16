package org.example.LLD.RideSharingApplication.entities;

import org.example.LLD.RideSharingApplication.enums.Gender;

import java.util.List;

public class RideUsageUsers extends User{
    private List<Ride> ridesUtilized;

    public RideUsageUsers(int id, String name, String email, String password, Gender gender, int age, List<Ride> ridesUtilized) {
        super(id, name, email, password, gender, age);
        this.ridesUtilized = ridesUtilized;
    }

    public RideUsageUsers(int id, String name, Gender gender, int age, List<Ride> ridesUtilized) {
        super(id, name, gender, age);
        this.ridesUtilized = ridesUtilized;
    }

}
