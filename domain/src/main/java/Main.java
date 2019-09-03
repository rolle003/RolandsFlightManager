import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    private static Object Booking;
    private static int bookingNo = 0;
    AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {

        Main menu = new Main();

        Map<Integer, String> bookings = new HashMap<Integer, String>();

        boolean stopinput = false;
        while (!stopinput) {
            System.out.print(
                    "1-Create booking\n" +
                            "2-Change booking\n" +
                            "3-Cancel booking\n" +
                            "4-Print booking\n" +
                            "5-Print airline totals\n" +
                            "6-Exit\n ");
            int selection = sc.nextInt();
//Clean buffer
            sc.nextLine();

            switch (selection) {
                case 1:   //Create booking
                    createBooking(bookings);
                    break;
                case 2:   //Change booking
                    changeBooking(bookings);
                    break;
                case 3:   //Cancel booking
                    cancelBooking(bookings);
                    break;
                case 4:   //Print booking
//                    printBooking(bookings);
                    break;
                case 5:   //Print airline totals
//                    printAirlineTotals(bookings);
                    break;
                case 6:   //Exit
                    System.exit(0);
                default:
                    System.out.println("Not a valid command");

            }    //switch
        }


    }

    // Create booking
    //       public static void createBooking() {
    public static void createBooking(Map<Integer, String> bookings) {

        String booking = "";

        String flightCode;
        String flightNumber = "";
        String ticketType = "";
        String menuType = "";
        String seat = "";
        int ticketPrice = 0;
        int totCustPrice = 0;

        String bookingInfo = "";

        System.out.println("Choose Flightnumber \n" +
                "A. LH422 Arlanda -> Moskva \n" +
                "B. LH423 Arlanda -> HongKong \n" +
                "C. LH424 Arlanda -> Oslo \n" +
                "A, B or C : ");


        flightCode = sc.nextLine();
        if (flightCode.equals("A")) {
            flightNumber = "LH422";
        }
        if (flightCode.equals("B")) {
            flightNumber = "LH423";
        }
        if (flightCode.equals("C")) {
            flightNumber = "LH424";
        }

        System.out.println("Choose Tickettype (E = Economy or B = Business : ");

        ticketType = sc.nextLine();

        //later. look for empty seat, if not ask customer if ok to change class


        System.out.println("tickettype" + ticketType);

        if (ticketType.equals("E")) {
            System.out.println("Choose FoodMenu E1 (Chicken) 100 SEK, E2 (Fish) 120 SEK or E3 (No food) : ");
            ticketPrice = 5000;
        }

        if (ticketType.equals("B")) {
            System.out.println("Choose FoodMenu B1 (Entrecote) 200 SEK, B2 (Lobster) 300 SEK or B3 (No food) : ");
            ticketPrice = 20000;
        }

        menuType = sc.nextLine();

        bookingInfo = flightNumber + "," + ticketType + "," +
                menuType + "," + seat + "," +
                ticketPrice + "," + totCustPrice;
        //later. add total amount to company totals

        bookingNo++;

        bookings.put(bookingNo, bookingInfo);

        System.out.println("Your booking \n" +
                "Bookingno  : " + bookingNo + "\n" +
                "Flight     : " + flightNumber + "\n" +
                "Tickettype : " + ticketType + "\n" +
                "Menutype   : " + menuType);

        System.out.println("bookings " + bookings);

    }

    //       public static void changeBooking() {
    public static void changeBooking(Map<Integer, String> bookings) {

        int bookingNoChange = 0;
        String bookingChange = "";

        String flightNumber = "";
        String ticketType = "";
        String menuType = "";
        String newValue = "";

        System.out.println("Fill in bookingnumber ");

        bookingNoChange = sc.nextInt();

        //Clean buffer
        sc.nextLine();

        String bookingsValue = bookings.get(bookingNoChange);

        //later. add split of valuefield in hashmap to separate fields to update changes and
        //then put back in hashmap

        System.out.println("");
        System.out.println("What do You want to change ?\n" +
                "A.  Flightnumber\n" +
                "B.  Tickettype\n" +
                "C.  Menutype\n" +
                "A, B or C : ");


        bookingChange = sc.nextLine();

        System.out.println("Fill in new value : ");

        if (bookingChange.equals("A")) {
            flightNumber = sc.nextLine();
            //     add substring later
            newValue = flightNumber;
        }
        if (bookingChange.equals("B")) {
            ticketType = sc.nextLine();
            //     add substring later
            newValue = ticketType;
        }
        if (bookingChange.equals("C")) {
            menuType = sc.nextLine();
            //     add substring later
            newValue = menuType;
        }

        //       System.out.println("Change flight, bookingNo : " + bookingNo);
        //       System.out.println("Change flight, new value : " + newValue);

        bookings.put(bookingNoChange, newValue);

        System.out.println("Your booking \n" +
                "Bookingno  : " + bookingNoChange + "\n" +
                "Flight     : " + flightNumber + "\n" +
                "Tickettype : " + ticketType + "\n" +
                "Menutype   : " + menuType);

        System.out.println("bookings " + bookings);

    }

    //       public static void cancelBooking() {
    public static void cancelBooking(Map<Integer, String> bookings) {

        int bookingNoCancel = 0;

        String newValue = "";

        System.out.println("Fill in bookingnumber to be cancelled ");

        bookingNoCancel = sc.nextInt();

        //Clean buffer
        sc.nextLine();


        bookings.remove(bookingNoCancel);

        System.out.println("bookings " + bookings);

        System.out.println("Your booking has been cancelled");


    }


}

