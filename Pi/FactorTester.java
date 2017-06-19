import java.util.Scanner; //importing scanner

/**
 * Gets the prime factors of a user supplied number.
 * 
 * @Robert Ringstad
 * @ver1.01
 */
public class FactorTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //Creating scanner object
        
        boolean done = false; //Setting done to false
        
        while(!done) //While not done, do this
        {
            System.out.println("Would you like to run? Y/N?"); //Prompting the user if they wish to run the program
            String yN = in.next(); //Getting input
        
            if(yN.equalsIgnoreCase("Y")) //If the user supplies y, then done is still false, and the program executes
            {
                System.out.println("Number to factor: ");
                int n = in.nextInt(); //Getting input
        
                FactorGenerator factor = new FactorGenerator(n);
        
                System.out.println("Factors: ");
        
                while(factor.moreFactors() == true)
                {
                    System.out.println(factor.getFactor());
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
