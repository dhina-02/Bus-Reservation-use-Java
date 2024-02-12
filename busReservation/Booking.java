package busReservation;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;  //Date object for store dates

    Booking(){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of passenger : ");
        passengerName = scanner.next();
        System.out.println("Enter bus no : ");
        busNo = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); //Convert string to date type
        //create object and specify the format "dd-MM-yyyy" how input will be enter by user
       try{
           date = dateFormat.parse(dateInput); //*here dateInput use parse method covert string to given type
       }catch (ParseException e){
           e.printStackTrace();
       }
    }
    public boolean isAvailable() throws SQLException{
    	BusDAO busdao = new BusDAO();
    	BookingDAO bookingdao = new BookingDAO();
    	int capacity = busdao.getCapacity(busNo);
        int booked = bookingdao.getBookedCount(busNo,date);
    
       return booked<capacity;
    }
}
