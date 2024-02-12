package busReservation;
import java.util.Scanner;
import java.sql.SQLException;

public class BusDemo {
    public static void main(String[] args) {
        
    	BusDAO busdao = new BusDAO();
    	try {
        busdao.displayBusInfo();
 

     int userOpt = 1;
     Scanner obj = new Scanner(System.in);


     while(userOpt==1){
         System.out.println("Enter 1 to book and 2 to exit");
         userOpt = obj.nextInt();
         if (userOpt==1){
             Booking booking = new Booking();
             if (booking.isAvailable()){ 
            	 BookingDAO bookingdao  = new BookingDAO();
                 bookingdao.addBooking(booking);
                 System.out.println("Your booking confirmed");
             }else {
                 System.out.println("Booking is full");
             }
         }
         else{
             System.out.println("Booking cancelled");
         }
     }
     obj.close();
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    }
}
