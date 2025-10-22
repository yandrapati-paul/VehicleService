package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.DbConnectionUtil;
import com.exceptions.VehicleNumberNotFoundException;
import com.model.VehicleService;
import com.util.DbConnectionUtil;

public class VehicleServiceDaoImpl implements VehicleServiceDao  {

	@Override
	public void save(VehicleService vehicle) {
		String sql="insert into vehicleService(id,VehicleNumber,OwnerName,ServiceType,Cost) values(?,?,?,?,?)";
		try (Connection con = DbConnectionUtil.getConnection();
		              PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setInt(1,vehicle.getId());
			pst.setString(2,vehicle.getVehicleNumber());
			pst.setString(3,vehicle.getOwnername());
			pst.setString(4,vehicle.getServiceType());
			pst.setDouble(5, vehicle.getCost());
			pst.executeUpdate();
			System.out.println("Vehicle saved:"+vehicle);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<VehicleService> findAll() {
		String sql="select * from vehicleService";
		List<VehicleService>vehicle=new ArrayList<>();
		try (Connection con = DbConnectionUtil.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
			ResultSet res=pst.executeQuery();
			while(res.next()) {
				VehicleService vs=new VehicleService();
				vs.setId(res.getInt(1));
				vs.setVehicleNumber(res.getString(2));
				vs.setOwnername(res.getString(3));
				vs.setServiceType(res.getString(4));
				vs.setCost(res.getDouble(5));
				vehicle.add(vs);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

		
		return vehicle;
	}

	@Override
	public VehicleService findById(int id) throws VehicleNumberNotFoundException {
		String sql="select * from vehicleService where id=?";
		VehicleService vs=new VehicleService();
		try (Connection con = DbConnectionUtil.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            if(res.next()) {
            	vs.setId(res.getInt(1));
				vs.setVehicleNumber(res.getString(2));
				vs.setOwnername(res.getString(3));
				vs.setServiceType(res.getString(4));
				vs.setCost(res.getDouble(5));
            }
		}catch(SQLException e) {
				e.printStackTrace();
		}
		
		return vs;
	}

	@Override
	public void update(VehicleService vehicle) throws VehicleNumberNotFoundException {
		String sql="Update from vehicleService set VehicleNumber=?,Ownername=?,ServiceType=?,Cost=? ";
		try (Connection con = DbConnectionUtil.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1,vehicle.getVehicleNumber());
			pst.setString(2,vehicle.getOwnername());
			pst.setString(3,vehicle.getServiceType());
			pst.setDouble(4, vehicle.getCost());
			pst.executeUpdate();
			System.out.println("Updated sucessfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteById(int id) throws VehicleNumberNotFoundException {
		String sql="delete from vehicleService wher id=?";
		try (Connection con = DbConnectionUtil.getConnection();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("vehicleservice with id " + id + " has been deleted successfully");
		
	} catch (SQLException e) {
        e.printStackTrace();
    }

	}

}
