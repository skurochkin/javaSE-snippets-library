package T.Ticket.FlightTicketing;

/**
 * Created by VKurochkin on 9/20/2016.
 */
public class Seats {
        private final int NUMBER_OF_SEATS = 10;
        private boolean[] seats;
        //constructor
        public Seats(){
            //initializing array
            seats = new boolean[ NUMBER_OF_SEATS ];
            //set values to false - doesn't it do automatically?
            for( int counter = 0; counter < seats.length; counter++ ){
                seats[ counter ] = false;
            }//end of loop
        }//end of constructor
        public int assignSeat( int type){
            int seatPlace = -1; //default seatPlace value
            int firstI = 0;  // firstIndex
            int lastI = 4;
            if ( type == 2 ){
                firstI += 5;//second index
                lastI += 5;
            }
            for ( int i = firstI; i <= lastI; i++ ){
                if ( !seats[i] ){ // the element = false? this seat hasn't been assigned yet, assign it
                    seats[i] = true;
                    if ( type == 1 ){
                        System.out.printf( "You will seat in firs class on seat number %d\n" , ( i + 1 ) );
                    }
                    else if ( type == 2 ){
                        System.out.printf( "You will seat in second class on seat number %d\n" , ( i + 1 ) );
                    }
                    return seatPlace = i; // flag sucessfully seat assignment
                }
            }
            // if the method reaches this point, it means no seats were still available,
            return seatPlace;//returns -1
        }//end of assignSeats
        public boolean planeIsFull(){
            int counter = 0;//holding the number of filled seats
            for( int i = 0; i < seats.length; i++ ){
                if( seats[ i ] == true ){//if all the seats are taken
                    counter++;//increase counter
                }
            }//end of loop
            if( counter == NUMBER_OF_SEATS ){//if counter == 10 then the plane is full
                return true;
            }
            else{
                return false;
            }
        }//end of planeIsFull
    }//end of class

