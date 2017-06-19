import java.util.Scanner;

/**
 * Calculates prime numbers from 1 to n, where n is the user supplied value.
 * 
 * @Robert Ringstad
 * @ver1.00
 */
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int divisionCounter = 0;
        
        System.out.println("Find primes up to: ");
        int input = in.nextInt();
        
        for(int i = 1; i <= input; i++)
        {
            divisionCounter = 0;
            
            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                {
                    divisionCounter++;
                }
            }
                
                if(divisionCounter == 2 || i == 1)
                {
                    System.out.println(i);
                }
            
        }
    }
}
