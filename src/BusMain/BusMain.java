package BusMain;

import java.sql.SQLException;
import java.util.Scanner;

import com.busService.BusService;

public class BusMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("BusReservationSystem");
	      System.out.println("1.View All");
	      System.out.println("2.Add bus Reservation ");
	      System.out.println("3.Update bus Reservation ");
	      System.out.println("4.Delete bus Reservation");
	      
	      System.out.println("IPLManagementSystem");
	      BusService ss=new BusService();
	      
	      do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  ss.showdata();
          break;
	    	  case 2:
	    		 ss.insertBooking();
	    		  break;
	    	  case 3:
	    		  ss.UpdateBooking();
	    		  break;
	    	  case 4:
	    		 ss.deleteBusReservation();
	    		  break;
	    		  }
	    	 
	    	  System.out.println("do you want to continue");
	    	  s=sc.next();
	      }
	      while(s.equals("yes"));
	      
	}
	}


