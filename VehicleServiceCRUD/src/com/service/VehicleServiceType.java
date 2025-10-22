package com.service;
import java.util.*;

import com.exceptions.VehicleNumberNotFoundException;
import com.model.VehicleService;

public interface VehicleServiceType {
    void addVehicleService(VehicleService vehicle);

    List<VehicleService> getAllVehicleService();

    VehicleService getVehicleServiceById(int id) throws VehicleNumberNotFoundException;

    void updateVehicleService(VehicleService vehicle) throws VehicleNumberNotFoundException;

    void deleteVehicleServiceById(int id) throws VehicleNumberNotFoundException;

}