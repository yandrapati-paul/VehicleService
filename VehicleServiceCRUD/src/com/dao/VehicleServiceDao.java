package com.dao;

import java.util.List;

import com.exceptions.VehicleNumberNotFoundException;
import com.model.VehicleService;

public interface VehicleServiceDao {
	void save(VehicleService vehicle);
	List<VehicleService> findAll();
	VehicleService findById(int id)throws VehicleNumberNotFoundException;
	void update(VehicleService vehicle)throws VehicleNumberNotFoundException;
	void deleteById(int id)throws VehicleNumberNotFoundException;
	

}
