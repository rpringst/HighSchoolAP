
/**
 * Write a description of class PermutationTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermutationTester
{
    public static void main(String[] args)
    {
        PermutationGenerator permutation = new PermutationGenerator();
        
        int[] permutations = permutation.nextPermutation();
        
        System.out.println("A permutation of 1 - 10: ");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(permutations[i - 1]);
        }
    }
        
}
