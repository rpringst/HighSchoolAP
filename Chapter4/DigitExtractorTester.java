import java.util.Scanner;

/**
 * This program recieves input from the user as a 5 digit integer and returns them in reverse order.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class DigitExtractorTester
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter 5 digits: ");
       int digits = in.nextInt();
       DigitExtractor extractor = new DigitExtractor(digits);
       System.out.println(extractor.nextDigit());
       System.out.println(extractor.nextDigit());
       System.out.println(extractor.nextDigit());
       System.out.println(extractor.nextDigit());
       System.out.println(extractor.nextDigit());
    }
}
