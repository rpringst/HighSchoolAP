import java.util.Scanner;

/**
 * A program that computes various information about a triangle given SSS.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class TriangleTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Input coordinates for the triangle's vertices.");
        
        System.out.println("x1: ");
        double x1 = in.nextDouble();
        System.out.println("y1: ");
        double y1 = in.nextDouble();
        System.out.println("x2: ");
        double x2 = in.nextDouble();
        System.out.println("y2: ");
        double y2 = in.nextDouble();
        System.out.println("x3: ");
        double x3 = in.nextDouble();
        System.out.println("y3: ");
        double y3 = in.nextDouble();
        
        Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
        
        System.out.println("Side a: " + triangle.returnSideOne());
        System.out.println("Side b: " + triangle.returnSideTwo());
        System.out.println("Side c: " + triangle.returnSideThree());
        System.out.println("Angle A: " + triangle.returnAngleOne());
        System.out.println("Angle B: " + triangle.returnAngleTwo());
        System.out.println("Angle C: " + triangle.returnAngleThree());
        System.out.println("Perimeter: " + triangle.returnPerimeter());
        System.out.println("Area: " + triangle.returnArea());
    }
}
