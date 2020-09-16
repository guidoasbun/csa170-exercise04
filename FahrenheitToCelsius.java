/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 04
*/ 

import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
    
        double convertedToCelsius = (fahrenheit - 32) / 1.8;
        System.out.printf("The temperature in Celsius is %.3f", convertedToCelsius);
        
    }
}