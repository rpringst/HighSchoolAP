import java.util.Scanner; //importing scanner

/**
 * Gets the prime factors of a user supplied number.
 * 
 * @Robert Ringstad
 * @ver1.00
 */
public class Factor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Creating scanner object
        
        System.out.println("Number to factor: ");
        int n = in.nextInt(); //Getting input
        
        System.out.println("Factors: ");
        
        for(int i = 2; i <= n; i++)
        {
            while(n % i == 0)
            {
                System.out.println(i); //Returning the factor
                n = n / i; //Setting n to n divided by the last factor
            }
        }
    }
}
