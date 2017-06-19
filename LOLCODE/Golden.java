
/**
 * Write a description of class Golden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golden
{
    public static double getGolden(int n)
    {
        double total;
        double totalOne;
        double totalTwo;
        double factorialN;
        double factorialNOne;
        double factorialNTwo;
        
        if(n < 0)
        {
            total = 1;
            
            for(int i = 1; i <= n; i++)
            {
                total = total * i;
            }
            
            factorialN = total;
        }
        else
        {
            factorialN = 1;
        }
            
        if(n < 0)
        {
            totalOne = 1;
            double nOne = 2 * n + 1;
            
            for(int i = 1; i <= nOne; i++)
            {
                totalOne = totalOne * i;
            }
            
            factorialNOne = totalOne;
        }
        else
        {
            factorialNOne = 1;
        }
            
        if(n < 0)
        {
            totalTwo = 1;
            double nTwo = n + 2;
            
            for(int i = 1; i <= nTwo; i++)
            {
                totalTwo = totalTwo * i;
            }
            
            factorialNTwo = totalTwo;
        }
        else
        {
            factorialNTwo = 2;
        }
            
        double top = (Math.pow(-1, n + 1)) * factorialNOne;
        double bottom = factorialNTwo * factorialN * Math.pow(4, 2 * n + 3);
        double golden = top / bottom;
        
        return golden;
    }
}
