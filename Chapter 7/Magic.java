/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic
{
    public Magic(int sideLength)
    {
        n = sideLength;
        magicSquare = new int[n][n];
        counter = 0;
        magicSum = (n * ((n * n) + 1)) / 2;
        row = 0;
        col = 0;
        magic = "";
    }
    
    public void add(int input)
    {
        if(counter <= n * n)
        {
            magicSquare[row][col] = input;
            col++;
            counter++;
            
            if(col == n)
            {
                col = 0;
                row++;
            }
        }
    }
    
    public int getMagicSum()
    {
        return magicSum;
    }
    
    public boolean isMagic()
    {
        boolean isMagic = false;
        boolean isDone = false;
        int howMany = 0;

        while(isDone == false)
        {
            //top left to bottom right diagonal
            int topLeftBottomRight = 0;
            for(int i = 0; i < n; i++)
            {
                topLeftBottomRight = topLeftBottomRight + magicSquare[i][i];
            }
            
            if(topLeftBottomRight != magicSum)
            {
                isMagic = false;
                isDone = true;
            }
            
            if(isDone == true)
                break;
            
            if(topLeftBottomRight == magicSum)
            {
                howMany++;
            }
            
            //top right to bottom left diagonal
            int topRightBottomLeft = 0;
            int j = n - 1;
            for(int i = 0; i < n; i++)
            {
                topRightBottomLeft = topRightBottomLeft + magicSquare[i][j];
                j--;
            }
            
            if(topRightBottomLeft != magicSum)
            {
                isMagic = false;
                isDone = true;
            }
            
            if(isDone == true)
                break;
            
            if(topRightBottomLeft == magicSum)
            {
                howMany++;
            }
            
            //checking rows
            int rowSum = 0;
            for(int p = 0; p < n; p++)
            {
                rowSum = 0;
                for(int q = 0; q < n; q++)
                {
                    rowSum = rowSum + magicSquare[p][q];
                }
                    
                if(rowSum != magicSum)
                {
                    isMagic = false;
                    isDone = true;
                    break;
                }
            }
            
            if(isDone == true)
                break;
                
            howMany++;
                   
            //checking columns
            int colSum = 0;
            for(int t = 0; t < n; t++)
            {
                colSum = 0;
                for(int u = 0; u < n; u++)
                {
                    colSum = colSum + magicSquare[u][t];
                }
                    
                if(colSum != magicSum)
                {
                    isMagic = false;
                    isDone = true;
                    break;
                }
            }
            
            if(isDone == true)
                break;
            
            howMany++;
            
            if(howMany == 4)
            {
                isMagic = true;
                isDone = true;
            }
        }
            
        return isMagic;
    }
    
    public String toString()
    {
        for(int i = 0; i < n; i++)
        {
           for(int j = 0; j < n; j++)
           {
               magic = magic + magicSquare[i][j] + "\t";
           }
           
           magic = magic + "\n";
       }
       
       return magic;
    }
        
    
    private int n;
    private int[][] magicSquare;
    private int counter;
    private int magicSum;
    private int row;
    private int col;
    private String magic;
}
