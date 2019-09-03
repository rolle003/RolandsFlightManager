import java.util.HashMap;
import java.util.Map;

public abstract class Booking {

    public int bookingNo;

    public String customerNo;

    public String flightNo;

    public String ticketType;

    public String seatNo;

    public String menuCode;

    public Integer totPrice;

    public Integer foodPrice;

    public String custForName;

    public String custSurName;


    Booking(int bookingNo) {
        this.bookingNo = bookingNo;

    }

//    Map<Integer, Booking> bookings = new HashMap<Integer, Booking>();

    public int getBookingNo() {
        return bookingNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public Integer getTotPrice() {
        return totPrice;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public String getCustForName() {
        return custForName;
    }

    public String getCustSurName() {
        return custSurName;
    }


}

