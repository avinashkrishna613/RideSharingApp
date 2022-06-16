package org.example.LLD.RideSharingApplication.entities;

import org.example.LLD.RideSharingApplication.enums.VehicleTypes;

public class Vehicle {
    private int vehicleId;
    private String vehicleName;
    private String registrationNumber;
    private String barCode;
    private VehicleTypes vehicleType;
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Vehicle() {
    }

    public Vehicle(String vehicleName, String registrationNumber, String barCode, VehicleTypes vehicleType) {
        this.vehicleName = vehicleName;
        this.registrationNumber = registrationNumber;
        this.barCode = barCode;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", barCode='" + barCode + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
