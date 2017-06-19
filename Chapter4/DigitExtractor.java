/**
 * A class that recieves a set of integers and returns them in reverse order.
 * Robert P. Ringstad, 18 October 2009, Ver 1.0
 * 
 * NOTE: This is the extra credit program.
 */

public class DigitExtractor
{
    /**
     * Constructs the extractor object.
     * @param digits the digits you wish to be reversed.
     */
    public DigitExtractor(int digits)
    {
        sequence = digits;
    }
    
    /**
     * Returns the digits from last to first.
     * @return the last digit of the int input
     */
    public int nextDigit()
    {
        int singleDigit = sequence % 10;
        int newSequence = (sequence - singleDigit) / 10;
        sequence = newSequence;
        return singleDigit;
    }
    
    private int sequence;
}
