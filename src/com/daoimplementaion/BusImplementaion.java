package com.daoimplementaion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.BusDao;
import com.entity.BusEntity;

public class BusImplementaion implements BusDao {

	@Override
	public List<BusEntity> viewall() throws ClassNotFoundException, SQLException {
		ArrayList<BusEntity> al=new ArrayList<BusEntity>();
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("select * from bus_reservation");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			BusEntity e=new BusEntity();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setBus_root(rs.getString(3));
			e.setBus_time(rs.getString(4));
			e.setSeat_no(rs.getInt(5));
			e.setAmount(rs.getFloat(6));
			al.add(e);
			
	}
		return al;
	}
	@Override
	public void insertreservation(BusEntity b) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("insert into bus_reservation values(?,?,?,?,?,?)");
		st.setInt(1,b.getId());
		st.setString(2, b.getName());
		st.setString(3, b.getBus_root());
		st.setString(4, b.getBus_time());
		st.setInt(5, b.getSeat_no());
		st.setFloat(6, b.getAmount());
		st.executeUpdate();
		con.close();
		
		
		
	}

	@Override
	public void updatereservation(BusEntity b) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("update bus_reservation set name=?,bus_root=?,bus_time=?,seat_no=?,amount=?where id=?");
		st.setString(1,b.getName());
		st.setString(2, b.getBus_root());
		st.setString(3, b.getBus_time());
		st.setInt(4, b.getSeat_no());
		st.setFloat(5, b.getAmount());
		st.setInt(6,b.getId());
		st.executeUpdate();
		con.close();
			}

	@Override
	public void deletereservation(BusEntity b) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mydata","root","root");
		PreparedStatement st=con.prepareStatement("delete  from bus_reservation where id=?");
		
		
		st.setInt(1,b.getId());
		
		st.executeUpdate();
		con.close();	}

}
