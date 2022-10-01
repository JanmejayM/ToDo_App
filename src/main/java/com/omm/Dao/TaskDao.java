package com.omm.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.omm.model.Task;

public class TaskDao {
	
	
final	String url="jdbc:mysql://localhost:3306/Project_db";
final	String uname="root";
final	String pass="p2311986";
	

	public void add(Task task)
	{
		
		Connection connection;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,uname,pass);
			PreparedStatement stmt=connection.prepareStatement("insert into Task(brief,details)values(?,?);");
			stmt.setString(1,task.getBrief());
			stmt.setString(2,task.getDetails());
			
			stmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	
	public List<Task> update()
	{
		Connection connection;

		List<Task>taskArr=new ArrayList<Task>() ;


	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,uname,pass);
		PreparedStatement stmt=connection.prepareStatement("select * from Task");
		
	
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			Task task=new Task();
			
		   	task.setId(rs.getInt(1));
		   	task.setBrief(rs.getString(2));
		   	task.setDetails(rs.getString(3));
		   	
		   	taskArr.add(task);


		}
		
		

	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return taskArr;
	
	}
	
	
	public void clear()
	{
		
		Connection connection;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,uname,pass);
			Statement stmt=connection.createStatement();
			String query="truncate table Task";
			
			stmt.executeUpdate(query);

		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	}
	/* For Testing Database queries only*/
	public static void main(String []args)
	{
		TaskDao td=new TaskDao();
		System.out.println(td.update());
		td.clear();
		System.out.println(td.update());
	}
	

	
}
