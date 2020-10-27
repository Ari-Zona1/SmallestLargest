import java.util.*;
import java.io.*;

public class SmallestLargest {
    public static void main(String[] arguments){

        double value = 0;
        double large = 0;
        double holder = 0;
        System.out.println("Please pick a number that will be used as a terminating value. This number will not be included in the list of numbers");
        Scanner scan = new Scanner(System.in); //Gets user input
        double termValue = scan.nextDouble();
        System.out.println("Terminating value is " + termValue);
        System.out.println("Please type in the numbers one by one!");
        double small = scan.nextDouble();
        large = small;

        while (value != termValue){
            value = scan.nextDouble();
            if (value == termValue){
                break;
            }
            if(value > large){
                large = value;
            }else if (value < small){
                small = value;
            }
        }

        System.out.println(large);
        System.out.println(small);
    }
}