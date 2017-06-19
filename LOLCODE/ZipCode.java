
/**
 * Write a description of class ZipCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZipCode
{
    public ZipCode(int zip1, int zip2, int zip3, int zip4, int zip5)
    {
        zipOne = zip1;
        zipTwo = zip2;
        zipThree = zip3;
        zipFour = zip4;
        zipFive = zip5;
    }
    /**
     * The get Checksum method.
     * 
     * @return the checksum of the zipcode
     */
    public int getChecksum()
    {
        int total = zipOne + zipTwo + zipThree + zipFour + zipFive;
        int remainder = total % 10;
        int checksum = 10 - remainder;
        return checksum;
    }
    
    public String static doRepresentation(int digit)
    {
        int workingOn = digit;
        String representation;
        
        if(workingOn == 1)
        {
            representation = ":::||";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 3)
        {
            representation = "::||:";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn == 2)
        {
            representation = "::|:|";
        }
        else if(workingOn > 0)
        {
            representation = "-----";
        }
    
    private int zipOne;
    private int zipTwo;
    private int zipThree;
    private int zipFour;
    private int zipFive;
}
