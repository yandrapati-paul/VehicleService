package com.model;

public class VehicleService {
	private int id;
	private String VehicleNumber;
    private String Ownername;
    private String ServiceType;
    private double Cost;
    
    public VehicleService() {
    	
    }

	public VehicleService(int id, String vehicleNumber, String ownername, String serviceType, double cost) {
		super();
		this.id = id;
		VehicleNumber = vehicleNumber;
		Ownername = ownername;
		ServiceType = serviceType;
		Cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleNumber() {
		return VehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		VehicleNumber = vehicleNumber;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "VehicleService [id=" + id + ", VehicleNumber=" + VehicleNumber + ", Ownername=" + Ownername
				+ ", ServiceType=" + ServiceType + ", Cost=" + Cost + "]";
	}

}