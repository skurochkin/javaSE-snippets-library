package T.Ticket.FlightTicketing;

import javax.swing.*;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class SeatsTest {
    //constants
    static final int FIRST_CLASS_SELECTION = 1;//first class
    static final int SECOND_CLASS_SELECTION = 2;//second class
    public static void main( String[] args ){
        Seats seatingPlan = new Seats();
        int planeLeave = 0; //flag if users don't want to book more seats
        //int firstCounter = 0;//keep the seat count
        //int secondCounter = 0;
        //display message
        String action = JOptionPane.showInputDialog( "Please type 1 for First Class and 2 for Economy Class, 0 to quit" );
        //flag determines whether seats have been assigned or not
        int seatAssigned = 0;
        //create message
        String message = String.format( "Thank you. You have chosen %s class.", action );
        //display message
        JOptionPane.showMessageDialog( null, message );
        //convert string to int
        int classRequested = Integer.parseInt( action );
        while( classRequested != 0){
            //call function with class chose by user
            seatAssigned = seatingPlan.assignSeat( classRequested );
            boolean seatsStatus = seatingPlan.planeIsFull();//check the status of the seat
            if( seatsStatus ){
                System.out.println( "\nSorry but the flight is full. " );
                break;//terminate the application
            }
            if( seatAssigned == -1 ){
                //contains y (assign seat in the other class )or n (dont' assign seat in the other class)
                //String userChoice;
                //to convert user input from string to char
                char userInput;
                //switch statement to assign seats of the other class if one is full
                switch( classRequested ){
                    case 1:
                        //ask user to change class
                        action = JOptionPane.showInputDialog( "Sorry, the first class is full. Do you want to have a seat in second class? Type y for yes and n for no." );
                        message = String.format( "\nYou have selected %s", action );
                        userInput = action.charAt(0);//convert user input to char
                        JOptionPane.showMessageDialog( null, message );
                        //System.out.println("\nThe value of userInput is " + userInput);
                        if( userInput == 'y' ){
                            //secondCounter++;
                            seatingPlan.assignSeat( SECOND_CLASS_SELECTION );
                            seatsStatus = seatingPlan.planeIsFull();//check the status of the seat
                            if( seatsStatus ){
                                break;//leave switch
                            }
                        }
                        else{
                            planeLeave = 1;
                            //System.out.println( " The next plane leaves in 3 hrs " );
                            break;//leave switch
                        }
                        break;//leave switch
                    case 2:
                        //ask user to change class
                        action = JOptionPane.showInputDialog( "Sorry, the second class is full. Do you want to have a seat in first class? Type y for yes and n for no." );
                        message = String.format( "\nYou have selected %s ", action );
                        userInput = action.charAt(0);//convert user input to char
                        JOptionPane.showMessageDialog( null, message );
                        if( userInput == 'y' ){
                            //firstCounter++;
                            seatingPlan.assignSeat( FIRST_CLASS_SELECTION );
                            seatsStatus = seatingPlan.planeIsFull();//check the status of the seat
                            if( seatsStatus ){
                                break;//leave switch
                            }
                        }
                        else{
                            planeLeave = 1;
                            //System.out.println( " The next plane leaves in 3 hrs " );
                            break;//leave switch
                        }
                        break;//leave switch
                }//end of switch
                if( ( planeLeave == 1 ) ){//if uses don't want more seats leave the application
                    break;//leave application
                }
                else if( seatsStatus ){
                    System.out.println( "\nSorry but the flight is full. " );
                    break;//leave application
                }
            }//end of if( seatAssigned == -1 )
            //ask for input again
            action = JOptionPane.showInputDialog( "More seats? Please type 1 for First Class and 2 for Economy Class, 0 to quit" );
            //create message
            message = String.format( "Thank you. You have chosen %s class.", action );
            //display message
            JOptionPane.showMessageDialog(null, message);
            classRequested = Integer.parseInt( action );
        }//end of while
        System.out.println( "The next plane leaves in 3 hrs." );
    }//end of main
}//end of class
