package F;

import java.util.Scanner;

/**
 * Created by slavkurochkin on 2/23/17.
 */
public class ComputeFactorial {

    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer: ");
        int n = input.nextInt();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static long factorial(int n){
        if(n==0){ // Base case
            return 1;
        }else{
            return n * factorial(n -1); // Recursive call
        }
    }
}
