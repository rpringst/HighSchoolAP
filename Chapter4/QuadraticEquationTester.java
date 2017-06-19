import java.util.Scanner;

/**
 * A program that computes the quadratic formula from user input.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class QuadraticEquationTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("A?");
        double a = in.nextDouble();
        System.out.println("B?");
        double b = in.nextDouble();
        System.out.println("C?");
        double c = in.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        System.out.println("Solution 1: " + quadratic.getSolution1());
        System.out.println("Solution 2: " + quadratic.getSolution2());
    }
}

