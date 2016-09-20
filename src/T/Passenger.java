package T;

import java.util.Scanner;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class Passenger {

    private String name;
    private int row;
    private int seat;


    public Passenger() {

    }


    public Passenger(String passengerName, int requestedRow, int requestedSeat) {

        name = passengerName;
        row = requestedRow;
        seat = requestedSeat;


        Scanner sc = new Scanner(System.in);

        System.out.println("enter the passenger name or 'stop' to quite: ");
        name = sc.next();

        do {
            System.out.println("what row would you like to sit on? ");
            row = sc.nextInt();
            System.out.println("what sear would you like to sit on? ");
            seat = sc.nextInt();
        } while (name.equals("stop"));
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public int getSeatNumber() {
        return seat;
    }

    public char getSeatCode() {
        return seatPreference();
    }


    public char seatPreference() {
        char newSeat = 0;
        if (seat == 1) {
            newSeat = 'A';
        } else if (seat == 2) {
            newSeat = 'B';
        } else if (seat == 3) {
            newSeat = 'C';
        } else if (seat == 4) {
            newSeat = 'D';
        }
        return newSeat;
    }

    public void setPreference(int newRow, char newSeat) {

    }
}