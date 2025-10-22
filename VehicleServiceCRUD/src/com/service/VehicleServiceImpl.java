package com.service;

import java.util.List;

import com.dao.VehicleServiceDao;
import com.dao.VehicleServiceDaoImpl;
import com.exceptions.VehicleNumberNotFoundException;
import com.model.VehicleService;

public class VehicleServiceImpl implements VehicleServiceType {
	VehicleServiceDao dao = new VehicleServiceDaoImpl();

	@Override
	public void addVehicleService(VehicleService vehicle) {
		dao.save(vehicle);
		
	}

	@Override
	public List<VehicleService> getAllVehicleService() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public VehicleService getVehicleServiceById(int id) throws VehicleNumberNotFoundException {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public void updateVehicleService(VehicleService vehicle) throws VehicleNumberNotFoundException {
		// TODO Auto-generated method stub
		 dao.update(vehicle);
		
	}

	@Override
	public void deleteVehicleServiceById(int id) throws VehicleNumberNotFoundException {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

    
    
	

}
