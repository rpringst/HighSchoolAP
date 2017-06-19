
/**
 * Write a description of class FactorGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FactorGenerator
{
    public FactorGenerator(int input)
    {
        n = input;
        i = 2;
        done = false;
    }
    
    public int getFactor()
    {
        done = false;
        
        while(!done)
        {
            if(n % i == 0)
            {
                n = n / i;
                done = true;
                lastFactor = i;
            }
        
            else if(n % i != 0)
            {
                i = i + 1;
            }
        }
        
        return lastFactor;
    }
    
    public boolean moreFactors()
    {
        if(i == lastFactor && n == 1)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    private int n;
    private int i;
    private int lastFactor;
    private boolean done;
}
