package com.rays.Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksheetModel {
	
	public void add(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setString(3, bean.getRollNo());
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(5, bean.getChem());
		ps.setInt(4, bean.getPhy());
		ps.setInt(6, bean.getMath());
		
		ps.executeUpdate();
		
		conn.commit();
		System.out.println("INSerted");
		ps.close();
		conn.close();
		
	}
	
	public void Update(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("Update marksheet set name=? where id=?");
		ps.setString(1, bean.getName() );
		ps.setInt(2, bean.getId());
		
		ps.executeUpdate();
		
		conn.commit();
		System.out.println("Updated");
		ps.close();
		conn.close();
		
	}
	
	public void Delete(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("delete from marksheet where id=?");
		
		ps.setInt(1, bean.getId());
		
		ps.executeUpdate();
		
		conn.commit();
		System.out.println("deleted");
		ps.close();
		conn.close();
		
	}
	public void get(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("select * from marksheet where rollNo=?");
		
		ps.setString(1, bean.getRollNo());
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			
		}
		
		conn.commit();
		System.out.println("Data");
		ps.close();
		conn.close();
		
		
	}
	public void getMeritList(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("select * , (physics + chemistry+ maths) as total from marksheet order by Total desc limit 0 , 5");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print("\t"+ rs.getString(1));
			System.out.print( "\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getString(4));
			System.out.print("\t"+rs.getString(5));
			System.out.println("\t"+rs.getString(6));
			
		}
		
		conn.commit();
		System.out.println("MeriList");
		ps.close();
		conn.close();
		
		
		
		
	}
	
public void Search(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays" , "root" , "root");
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("select * from Marksheet");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.print("\t"+ rs.getString(1));
			System.out.print( "\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getString(4));
			System.out.print("\t"+rs.getString(5));
			System.out.println("\t"+rs.getString(6));
			
		}
		
		conn.commit();
		System.out.println("Records");
		ps.close();
		conn.close();
		
		
		
		
	}

}
