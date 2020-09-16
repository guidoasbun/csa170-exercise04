/* 
*   Guido Asbun
*   CS A170 
*   15-September-2020     
* 
*   Exercise 04
*/ 

import java.util.Scanner;
public class Average
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers - I will average them: ");
        
        final int TOTAL_NUMBERS = 3;
        double numberOne = input.nextInt();
        double numberTwo = input.nextInt();
        double numberThree = input.nextInt();
        double average = (numberOne + numberTwo + numberThree) / TOTAL_NUMBERS;
        
        System.out.printf("The average of %.2f, %.2f, and %.2f is %.2f", numberOne, numberTwo, numberThree, average);
    }
}