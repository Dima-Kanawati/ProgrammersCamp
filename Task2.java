//Name: Dima Kanawati/ Task 2 / Membership number: 101
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Format.
        System.out.println("Programming camp!");
        System.out.println("Task #2");
        System.out.println("(This program takes a number and a length and return an array of multiples of that number)");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        //Number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        //Length.
        System.out.print("Enter a length: ");
        int length = input.nextInt();
        
        //Printing the output.
        System.out.print("Array of Mutiples (" + number + ", " + length +"): [");
        int[] function = arrayOfMultiples(number, length);
        for(int i = 0; i < length; i++){
            System.out.print(" " + function[i]);
        }
        System.out.println(" ]");  
    }
    
    //Array of multiple function.
    public static int[] arrayOfMultiples(int number, int length){
        int[] arrayOfNumbers = new int [length];
        for (int i = 0; i < length; i++){
            arrayOfNumbers[i] = number * (i + 1);
        }
        return  arrayOfNumbers;
    }
}
