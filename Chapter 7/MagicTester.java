import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class MagicTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        
        System.out.println("Please enter the side length of your magic square.");
        int n = in.nextInt();
        
        Magic magic = new Magic(n);
        
        System.out.println("Please enter " + (n * n) + " numbers, in the order that you want them in the magic square, in the set of 1 to " + (n * n) + ".");
        
        for(int i = 1; i <= n * n; i++)
        {
            int input = in.nextInt();
            
            if(input > n * n)
            {
                System.out.println("Too big!!!");
                throw new RuntimeException("Follow Directions Please!");
            }
                
            
            if(inputs.contains(input) == true)
            {
                System.out.println("I told you to only enter them once each!!!");
                throw new RuntimeException("Follow Directions Please!");
            }
            else
            {
                inputs.add(input);
                magic.add(input);
            }
        }
        
        String magicString = magic.toString();
        System.out.println("You entered this:");
        System.out.println(magicString);
        
        if(magic.isMagic() == true)
        {
            System.out.println("This is a magic square!");
        }
        else
        {
            System.out.println("This is not a magic square!!! :(");
        }
    }
}
