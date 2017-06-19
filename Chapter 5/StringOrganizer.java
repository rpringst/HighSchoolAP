public class StringOrganizer
{
    public StringOrganizer(String a1, String b1, String c1)
    {
        a = a1;
        b = b1;
        c = c1;
        
        //establishing what is first
        if((a.compareTo(b) < 0) && (a.compareTo(c) < 0))
        {
            sA = 1;
        }
        
        else if((b.compareTo(a) < 0) && (b.compareTo(c) < 0))
        {
            sB = 1;
        }
        
        else if((c.compareTo(a) < 0) && (c.compareTo(b) < 0))
        {
            sC = 1;
        }
        
        
        //establishing the rest of the order
        if((sB != 1) && (sC != 1))
        {
            if(b.compareTo(c) < 0)
            {
                sB = 2;
                sC = 3;
            }
            
            else if(c.compareTo(b) < 0)
            {
                sC = 2;
                sB = 3;
            }
        }
        
        else if((sA != 1) && (sC != 1))
        {
            if(a.compareTo(c) < 0)
            {
                sA = 2;
                sC = 3;
            }
            
            else if(c.compareTo(a) < 0)
            {
                sC = 2;
                sA = 3;
            }
        }
        
        else if((sA != 1) && (sB != 1))
        {
            if(a.compareTo(b) < 0)
            {
                sA = 2;
                sB = 3;
            }
            
            else if(b.compareTo(a) < 0)
            {
                sB = 2;
                sA = 3;
            }
        }
        
        //converting the order into properly sorted strings
        
        if(sA == 1 && sB == 2 && sC == 3)
        {
            one = a;
            two = b;
            three = c;
        }
        
        else if(sA == 1 && sB == 3 && sC == 2)
        {
            one = a;
            two = c;
            three = b;
        }
        
        else if(sA == 2 && sB == 1 && sC == 3)
        {
            one = b;
            two = a;
            three = c;
        }
        
        else if(sA == 3 && sB == 1 && sC == 2)
        {
            one = b;
            two = c;
            three = a;
        }
        
        else if(sA == 2 && sB == 3 && sC == 1)
        {
            one = c;
            two = a;
            three = b;
        }
        
        else if(sA == 3 && sB == 2 && sC == 1)
        {
            one = c;
            two = b;
            three = a;
        }
    }
    
    public String getOne()
    {
        return one;
    }
    
    public String getTwo()
    {
        return two;
    }
    
    public String getThree()
    {
        return three;
    }
    
    private String a;
    private String b;
    private String c;
    private int sA;
    private int sB;
    private int sC;
    private String one;
    private String two;
    private String three;
}
