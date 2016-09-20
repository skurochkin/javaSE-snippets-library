package T.Ticket;

import java.util.Scanner;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class SelectMovie {

    // 1) Get the users name
    // 2) select movie
    // 3) select seats
    // 4) print out

    static Scanner input = new Scanner(System.in);
    static String name;
    static int number;
    static String[] movieList = {"1) The Avengers", "2) SAW IV", "3) X-Man", "4) Titanic"};

    public static void getName(){
        System.out.println("Please input your name");
        name = input.nextLine();
        System.out.println("Hello " + name);
        getMovie();
    }

    public static void getMovie() {
        System.out.println("Please select the movie");
        for(int i=0; i < movieList.length; i++){
            System.out.println(movieList[i]);
        }
        number = input.nextInt();
        System.out.println("You selected the movie " + movieList[number-1].substring(3, movieList[number-1].length()));
        getSeats();
    }

     public static void getSeats() {
         System.out.println("Please select how many seats you would like");
         String seats = input.next();
         System.out.println("Thank you,\nYou have selected " + seats + " seat(s) for the movie " + movieList[number-1].substring(3, movieList[number-1].length()));
    }

    public static void main(String[] args) {
        getName();
    }


}
