import java.util.Scanner;

/**
 * Write a description of class AlternatingIntegers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlternatingIntegers
{
    public static void main(String[] args)
    {
        int arrayLength = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int total = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers are you going to input?");
        arrayLength = in.nextInt();
        
        int[] inputs = new int[arrayLength];
        
        System.out.println("Please input each number individually, followed by enter.");
        
        for(int k = 1; k <= arrayLength; k++)
        {
            System.out.print(k + ": ");
            int inLoop = in.nextInt();
            inputs[k - 1] = inLoop;
        }
        
        for(int i = 1; i <= arrayLength; i++)
        {
            if(i % 2 != 0)
            {
                sumOdd = sumOdd + inputs[i - 1];
            }
            else
            {
                sumEven = sumEven + inputs[i - 1];
            }
        }
        
        sumEven = sumEven * (-1);
        total = sumEven + sumOdd;
        
        System.out.println("The alternating sum of those numbers is: " + total); 
        
    }
}
