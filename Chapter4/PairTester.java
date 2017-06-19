import java.util.Scanner;

/**
 * This program computes statistics on two, user supplied numbers, as well as gives back a leet message.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class PairTester
{
    public static void main(String[] args)
    {
        Scanner lolwut = new Scanner(System.in);
        System.out.println("Please type a number: ");
        double valOne = lolwut.nextDouble();
        System.out.println("Please type another number: ");
        double valTwo = lolwut.nextDouble();
        
        Pair leet = new Pair(valOne, valTwo);
        
        System.out.println("Here are some stats on those two numbers.");
        System.out.println("Sum: " + leet.pairSum());
        System.out.println("Difference: " + leet.pairDifference());
        System.out.println("Absolute difference: " + leet.pairDistance());
        System.out.println("Product: " + leet.pairProduct());
        System.out.println("Average: " + leet.pairAvg());
        System.out.println("Max value: " + leet.pairMax());
        System.out.println("Min value: " + leet.pairMin());
        System.out.println("And remember, always stay " + leet.returnLeet() + ".");
    }
}
