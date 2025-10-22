package com.controller;

import com.exceptions.VehicleNumberNotFoundException;
import com.model.VehicleService;
import java.util.*;
import com.service.*;
public class VehicleServiceApp {
	public static void main(String args[]) {
		VehicleServiceType vs = new  VehicleServiceImpl();
        vs.addVehicleService(new VehicleService(111, "VehicleNumber", "Ownername", "ServiceType",2200));
        vs.addVehicleService(new VehicleService(112, "VehicleNumber1", "Ownername1", "ServiceType1",2200));
        vs.addVehicleService(new VehicleService(113, "VehicleNumber2", "Ownername2", "ServiceType2",2200));
        vs.addVehicleService(new VehicleService(114, "VehicleNumber3", "Ownername3", "ServiceType3",2200));
        vs.addVehicleService(new VehicleService(115, "VehicleNumber4", "Ownername4", "ServiceType4",2200));
        System.out.println("VehicleService saved successfully");
        List<VehicleService> allVehicle = vs.getAllVehicleService() ;
        for ( VehicleService all : allVehicle) {
            System.out.println(all);
        }
        
        
        System.out.println("fetch  with VehcielService id 103");
        try {
        	VehicleService fetVehicleService = vs.getVehicleServiceById(103);
            System.out.println("Vehicle found:" + fetVehicleService);
        } catch (VehicleNumberNotFoundException e) {
            e.printStackTrace();
        }

        // update
        System.out.println("updating vehicle with id 101");
        try {
            vs.updateVehicleService(new VehicleService(101, "Vehicle number", "Ownername", "ServiceType",2000));
            System.out.println("VehicleService succefully updated");
        } catch (VehicleNumberNotFoundException e) {
            e.printStackTrace();
        }

        // delet by id
        System.out.println("deleting Vehicle with id 110");
        try {
            vs.deleteVehicleServiceById(110);
        } catch (VehicleNumberNotFoundException e) {
            e.printStackTrace();
        }

    }
	}
        

        
        
        
	
	


