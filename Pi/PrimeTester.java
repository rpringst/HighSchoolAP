import java.util.Scanner; //Importing scanner

/**
 * A program that calculates the primes up to a user supplied value.
 * 
 * @Robert Ringstad
 * @ver1.07
 */
public class PrimeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Creating the scanner object
        
        boolean done = false; //Setting done to false
        
        while(!done) //While not done, do this
        {
            System.out.println("Would you like to run? Y/N?"); //Prompting the user if they wish to run the program
            String yN = in.next(); //Getting input
        
            if(yN.equalsIgnoreCase("Y")) //If the user supplies y, then done is still false, and the program executes
            {
                System.out.println("Find primes to: "); //Prompting the user for the value which the program should find primes to
                int i = in.nextInt(); //Getting input
        
                PrimeGenerator prime = new PrimeGenerator(i); //Creating a PrimeGenerator object with the user's input as the parameter
                int primeNumber = 0; //Setting more or less a counter to 0
        
                for(int j = 1; j <= i; j++) //If j is less than or equal to user input, do this
                {
                    int oldPrime = primeNumber; //Allowing comparason later
                    primeNumber = prime.nextPrime(); //Finding the prime
            
                    if(oldPrime != primeNumber) //Without this, the program would go through the primes then keep printing the same thing
                    {
                        System.out.println(primeNumber); //Returns the most current prime
                    }
            
                    else
                    {
                        break; //Jumps out of the loop to stop it from printing the same thing over and over
                    }
            
                }
            }
            
            else if(yN.equalsIgnoreCase("N")) //If the user supplies N, then the program ends
            {
                done = true; //Setting done to true
            }
        }
        
        System.out.println("Goodbye!"); //Printing goodbye to the user
    }
}
