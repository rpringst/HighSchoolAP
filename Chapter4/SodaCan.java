/**
 * A class that figures the Volume and Surface Area of a cylinder (Soda Can).
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class SodaCan
{
    /**
     * Constructs the SodaCan object.
     * @param heightCan the height of the cylinder/can
     * @param diameterCan the height of the cylinder/can
     */
    public SodaCan(double heightCan, double diameterCan)
    {
        height = heightCan;
        diameter = diameterCan;
        radius = diameter / 2;
    }
    
    /**
     * Returns the volume of the cylinder/can.
     * @return the volume
     */
    public double getVolume()
    {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    /**
     * Returns the surface area of the cylinder/can.
     * @return the surface area
     */
    public double getSurfaceArea()
    {
        double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
        return surfaceArea;
    }
    
    private double height;
    private double diameter;
    private double radius;
}
