/**
 * A class that computes various stats on 2 numbers.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class Pair
{
    /**
     * Constructs a Pair object with two doubles.
     * @param aFirst the first double
     * @param aSecond the second double
     */
    public Pair(double aFirst, double aSecond)
    {
       x = aFirst;
       y = aSecond;
    }
    
    /**
     * Computes the sum of the two numbers.
     * @return the sum
     */
    public double pairSum()
    {
        double sum = x + y;
        return sum;
    }
    
    /**
     * Computes the difference of the two numbers.
     * @return the difference
     */
    public double pairDifference()
    {
        double difference = x - y;
        return difference;
    }
    
    /**
     * Computes the product of the two numbers.
     * @return the product
     */
    public double pairProduct()
    {
        double product = x * y;
        return product;
    }
    
    /**
     * Computes the average of the two numbers.
     * @return the average
     */
    public double pairAvg()
    {
        double avg = (x + y) / 2;
        return avg;
    }
    
    /**
     * Computes the distance between the two numbers.
     * @return the distance(absolute value)
     */
    public double pairDistance()
    {
        double difference = x - y;
        double absolute = Math.abs(difference);
        return absolute;
    }
    
    /**
     * Returns the larger number of the two.
     * @return the max
     */
    public double pairMax()
    {
        double max = Math.max(x, y);
        return max;
    }
    
    /**
     * Returns the smaller number of the two.
     * @return the min
     */
    public double pairMin()
    {
        double min = Math.min(x, y);
        return min;
    }
    
    /**
     * Returns the leet number, which is 1337.
     * @return 1337
     */
    public int returnLeet()
    {
        return LOLWUT;
    }
    
    private double x;
    private double y;
    public static final int LOLWUT = 1337;
    
}
