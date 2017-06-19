
/**
 * This class creates a simulation of the Monte Carlo dart experiment.
 * 
 * @Robert Ringstad
 * @ver1.01
 */
public class Dart
{
    public Dart(int tries)
    {
        t = tries;
        dartHits = 0;
        dartThrows = 0;
    }
    
    public void throwDarts()
    {
        for(int i = 1; i <= t; i++)
        {
            double x = Math.random();
            double y = Math.random();
            
            double distanceFromOrigin = Math.sqrt((x * x) + (y * y));
            
            if(distanceFromOrigin <= 1)
                {
                    dartHits = dartHits + 1;
                }
            dartThrows = dartThrows + 1;
        }
    }
    
    public double getPi()
    {
        double pi = 4 * ((double)dartHits / dartThrows);
        
        return pi;
    }
    
    private int t;
    private int dartHits;
    private int dartThrows;
}
