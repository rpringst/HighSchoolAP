/**
 * A class for changing numerical months into their English equivalents.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 */
public class Month
{
    /**
     * Constructs the Month object.
     * @param monthName the number of the month
     */
    public Month(int monthName)
    {
        month = monthName;
    }
    
    /**
     * Returns the month's name in English.
     * @return the month's name
     */
    public String getMonth()
    {
        int value1 = (month - 1) * 10;
        int value2 = (month * 10) - 1;
        String monthName = months.substring(value1, value2);
        String test = monthName.replace(" ", "");
        return test;
        
    }
    
    private int month;
    public static final String months = "January   February  March     April     May       June      July      August    September October   November  December ";
}