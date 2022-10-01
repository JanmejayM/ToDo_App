package com.omm.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.omm.Dao.TaskDao;
import com.omm.model.Task;

/**
 * Servlet implementation class TaskController
 */
public class TaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	String a=null;
//	String b=null;
       
    private TaskDao td=new TaskDao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	String a=request.getParameter("submit");	  
 
	 
	  if(a.equals("Add"))
	  {
		  addr(request,response);
		  request.setAttribute("TaskList",td.update());	
		  RequestDispatcher rd=request.getRequestDispatcher("/ContentToDo.jsp");
		  rd.forward(request, response);
		  //td.clear();

		  
		
	  }
	  else if(a.equals("Check Schedule")) {
		
		  request.setAttribute("TaskList",td.update());	

		  
		  RequestDispatcher rd=request.getRequestDispatcher("/ContentToDo.jsp");
		  rd.forward(request, response);
		  
		 
		  

     }
	  
	  else if(a.equals("Clear All Records"))
	  {
		  
           td.clear();
           
 		  request.setAttribute("TaskList",td.update());	

           
           RequestDispatcher rd=request.getRequestDispatcher("/ContentToDo.jsp");
 		  rd.forward(request, response);
 		  
           
		 
		  
	  }
		    


	}
	
	public void addr(HttpServletRequest request, HttpServletResponse response)
	{
		
		String brief=request.getParameter("brief");
		String description=request.getParameter("desc");
		
	    Task t=new Task();

     	//request.setAttribute("TaskList",td.update());

		
		t.setBrief(brief);
		t.setDetails(description);
        
		td.add(t);
		
	}
	
	


}
