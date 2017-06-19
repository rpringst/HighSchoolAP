public class Triangle
{
    public Triangle(double xOne, double yOne, double xTwo, double yTwo, double xThree, double yThree)
    {
        x1 = xOne;
        y1 = yOne;
        x2 = xTwo;
        y2 = yTwo;
        x3 = xThree;
        y3 = yThree;
        
        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        
        double equationPart = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        angA = Math.toDegrees(Math.acos(equationPart));
        double equationPart2 = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        angB = Math.toDegrees(Math.acos(equationPart2));
        double equationPart3 = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        angC = Math.toDegrees(Math.acos(equationPart3));
        
        double s = (a + b + c) / 2;
        double areaInput = (s - a) * (s - b) * (s - c) * s;
        double areaEquation = Math.sqrt(areaInput);
        area = areaEquation;

        perimeter = a + b + c;
        
    }
    
    public double returnSideOne()
    { 
        return a;
    }
    
    public double returnSideTwo()
    {
        return b;
    }
    
    public double returnSideThree()
    {
        return c;
    }
    
    public double returnAngleOne()
    {
        return angA;
    }
    
    public double returnAngleTwo()
    {
        return angB;
    }
    
    public double returnAngleThree()
    {
        return angC;
    }
    
    public double returnArea()
    {
        return area;
    }
    
    public double returnPerimeter()
    {
        return perimeter;
    }
    
    
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double a;
    private double b;
    private double c;
    private double angA;
    private double angB;
    private double angC;
    private double area;
    private double perimeter;
}
