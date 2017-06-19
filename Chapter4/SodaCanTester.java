import java.util.Scanner;

/**
 * This program computes Volume and Surface area of a cylinder.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class SodaCanTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Height of the Cylinder?");
        double height = in.nextDouble();
        System.out.println("Diameter of the Cylinder?");
        double diameter = in.nextDouble();
        SodaCan sodaPop = new SodaCan(height, diameter);
        System.out.println("The volume is: " + sodaPop.getVolume());
        System.out.println("The surface area is: " + sodaPop.getSurfaceArea());
    }
}
