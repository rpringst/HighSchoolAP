
/**
 * A class that constructs and figures primes to a user supplied value.
 * 
 * @Robert Ringstad
 * @ver1.03
 */
public class PrimeGenerator
{
    /**
     * Constructs a PrimeGenerator object.
     * @param input the number to which they will calculate
     */
    public PrimeGenerator(int input)
    {
        //Setting instance fields
        n = input;
        i = 1;
    }
    
    /**
     * Finds the next prime in increasing order.
     * @return the next prime in the series
     */
    public int nextPrime()
    {
        while(i <= n) //Testing to see if the current number is less than the user supplied value
        {
            int divisionCounter = 0; //Setting the division counter, primes are only divisible by 2 numbers
            
            for(int j = 1; j <= i; j++) //Looping j to i
            {
                if(i % j == 0) //Dividing i by j to see if there is a remainder
                {
                    divisionCounter++; //If no remainder, then it adds 1 to the division counter
                }
            }
            
            if(divisionCounter == 2) //If a number is only divisible by 2 numbers, then it is prime
            {
                currentPrime = i; //Setting currentPrime to be returned
                i = i + 1; //Increasing the instance field i by 1
                break; //Jumping out of the whole loop, if i was a prime
            }
            i = i + 1; //Incrementing i if i was not prime
        }
        
        return currentPrime; //Returning the most recent prime digit
    }
    
    //Declaring instance fields
    private int currentPrime;
    private int n;
    private int i; 
}
