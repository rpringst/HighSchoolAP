
/**
 * Write a description of class GoldenRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldenRunner
{
    public static void main(String[] args)
    {
        double runningTotal = 13.0 / 8.0;
        for(int i = 0; i <= 1500; i++)
        {
            runningTotal = runningTotal + Golden.getGolden(i);
            System.out.println(runningTotal);
        }
        
        System.out.println(runningTotal);
    }
}
