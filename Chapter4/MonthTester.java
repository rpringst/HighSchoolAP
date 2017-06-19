import java.util.Scanner;

/**
 * A program that returns the month corresponding with its numerical value.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class MonthTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type the month's number.");
        int monthName = in.nextInt();
        Month month = new Month(monthName);
        System.out.println("That month is " + month.getMonth() + ".");
    }
}
