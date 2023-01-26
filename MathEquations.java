/*
Name: Kennedy Keyes
Date: September 22, 2021
Program: MathEquations.java
Description: This program will demonstrate the use of the Math class methods.
 */
package math.equations;
import java.lang.Math;

/**
 *
 * @author codingken
 */
public class MathEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Declare variables
        double a = 43.5;
        double b = 49;
        
        // Print out the square root values
        System.out.println("The square root value is: " + Math.sqrt(a));
        System.out.println("The square root value is: " + Math.sqrt(b));
        System.out.println();
        
        // Find the exponential value of the two numbers
        a = 233.4;
        b = 30;
        
        // Print out the exponential values
        System.out.println("The exponential value is: " + Math.exp(a));
        System.out.println("The exponential value is: " + Math.exp(b));
        System.out.println();
        
        // Find the maximum and minimum value of the two numbers
        a = 57.8;
        b = -57.8;
        
        // Print out the maximum and minimum value
        System.out.println("The maximum value is: " + Math.max(a, b)); // max
        System.out.println("The minimum value is: " + Math.min(a, b)); // min
        System.out.println();
        
        // Find the natural logarithm of the two numbers
        a = 2342;
        b = 10;
        
        // Print out the natural log values
        System.out.println("The natural log value is: " + Math.log(a));
        System.out.println("The natural log value is: " + Math.log(b));
        System.out.println();
    }
    
}
