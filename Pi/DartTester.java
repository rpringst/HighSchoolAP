
/**
 * Tests the dart class, estimating pi by throwing 15,000 'darts'
 * 
 * @Robert Ringstad
 * @ver1.00
 */
public class DartTester
{
    public static void main(String[] args)
    {
        Dart dart = new Dart(15000);
        dart.throwDarts();
        System.out.println(dart.getPi());
    }
}
