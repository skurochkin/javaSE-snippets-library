package L;

import java.util.Scanner;

/**
 * Created by VKurochkin on 9/19/2016.
 */
public class LeapYear {
    public static void main(String[] args){
        //  Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // Check of the year is leap
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display the result
        System.out.println(year + "is a leap year? " + isLeapYear);
    }
}
