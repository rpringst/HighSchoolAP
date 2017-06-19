import java.math.BigInteger;

public class FactorialTwo
{
    public static BigInteger factorial(int n)
    {
        BigInteger q = BigInteger.valueOf(n);
        if( n <= 1 )
            return BigInteger.valueOf(1);
        else
            return q.multiply(factorial( n - 1 ));
    }

    // Simple program
    public static void main( String [ ] args )
    {
        for( int i = 0; i <= 720; i++ )
            System.out.println(i + " : " + factorial(i));
    }
}
