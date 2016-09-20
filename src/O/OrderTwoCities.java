package O;

import java.util.Scanner;

/**
 * Created by slavkurochkin on 9/19/16.
 */
public class OrderTwoCities {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user enter two cities
        System.out.println("Enter first city name: ");
        String city1 = input.nextLine();
        System.out.println("Enter second city name: ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);

    }
}
