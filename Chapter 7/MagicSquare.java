import java.util.Scanner;

/**
 * Write a description of class MagicSquareTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicSquare
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int n = 2;
       
       while(n % 2 == 0)
       {
           System.out.println("Please input an odd number to construct a magic square with.");
           n = in.nextInt();
       }
       
       int[][] magic = new int[n][n];
       
       int row = n - 1;
       int col = n / 2;
       magic[row][col] = 1;
       
       for(int i = 2; i <= n * n; i++)
       {
           if(magic[(row + 1) % n][(col + 1) % n] == 0)
           {
               row = row + 1;
               col = col + 1;
               
               if(row == n)
               {
                   row = 0;
               }
               
               if(col == n)
               {
                   col = 0;
               }
           }
           else
           {
               row = row - 1;
               
               if(row < 0)
               {
                   row = n - row;
               }
           }
           
           magic[row][col] = i;
       }
       
       for(int i = 0; i < n; i++)
       {
           for(int j = 0; j < n; j++)
           {
               System.out.print(magic[i][j] + "\t");
           }
           
           System.out.println(" ");
       }
   }
}
