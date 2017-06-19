/**
 * A class that figures the Quadratic Equation.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class QuadraticEquation
{
    /**
     * Constructs a QuadraticEquation object.
     * @param a1 a of ax^2 + bx + c = 0
     * @param b1 b of ax^2 + bx + c = 0
     * @param c1 c of ax^2 + bx + c = 0
     */
    public QuadraticEquation(double a1, double b1, double c1)
    {
        a = a1;
        b = b1;
        c = c1;
    }
    
    /**
     * Returns the first solution to the Quadratic.
     * @return solution one
     */
    public double getSolution1()
    {
        double solutionOne = (-(b) + Math.sqrt(b * b - (4 * a * c))) / 2 * a;
        return solutionOne;
    }
    
    /**
     * Returns the second solution to the Quadratic.
     * @return solution two
     */
    public double getSolution2()
    {
        double solutionTwo = (-(b) - Math.sqrt(b * b - (4 * a * c))) / 2 * a;
        return solutionTwo;
    }
    
    private double a;
    private double b;
    private double c;
    
}
