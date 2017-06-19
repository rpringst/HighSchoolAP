import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class PermutationGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermutationGenerator
{
    
    public PermutationGenerator()
    {
        pickFrom.add(1);
        pickFrom.add(2);
        pickFrom.add(3);
        pickFrom.add(4);
        pickFrom.add(5);
        pickFrom.add(6);
        pickFrom.add(7);
        pickFrom.add(8);
        pickFrom.add(9);
        pickFrom.add(10);
    }

    public int[] nextPermutation()
    {
        int[] permutation = new int[10];
        
        for(int i = 1; i <= 10; i++)
        {
            int randomNumberThingy = 11 - i;
            int permutationPicker = generator.nextInt(randomNumberThingy);
            int x = pickFrom.get(permutationPicker);
            pickFrom.remove(permutationPicker);
            permutation[i - 1] = x;
        }
        
        return permutation;
        
    }
    
    Random generator = new Random();
    ArrayList<Integer> pickFrom = new ArrayList<Integer>();
}
