package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.BusEntity;

public interface BusDao {
	public  List<BusEntity>viewall() throws ClassNotFoundException, SQLException;
	public void insertreservation(BusEntity b) throws ClassNotFoundException,SQLException ;
	public void updatereservation(BusEntity b) throws ClassNotFoundException, SQLException;
	public void deletereservation(BusEntity b) throws ClassNotFoundException,SQLException;

}
