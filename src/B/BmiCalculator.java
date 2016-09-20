package B;

import java.util.Scanner;

/**
 * Created by slavkurochkin on 9/19/16.
 */
public class BmiCalculator {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in pounds
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms/(heightInMeters*heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
