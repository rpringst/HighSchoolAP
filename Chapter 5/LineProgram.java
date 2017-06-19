public class LineProgram
{
    public LineProgram(double x, double y, double m1)
    {
        m = m1;
        b = y - (m * x);
        a = 0;
    }
    
    public LineProgram(double x1, double y1, double x2, double y2)
    {
        m = (y2 - y1) / (x2 - x1);
        b = y1 - (m * x1);
        a = 0;
    }
    
    public LineProgram(double m1, double b1)
    {
        m = m1;
        b = b1;
        a = 0;
    }
    
    public LineProgram(double a1)
    {
        a = a1;
        m = 0;
        b = 0;
    }
    
    public double getM()
    {
        return m;
    }
    
    public double getB()
    {
        return m;
    }
    
    public double getA()
    {
        return a;
    }
    
    public boolean intersect(LineProgram other)
    {
        if(this.a == 0 && other.a == 0)
        {
            if(this.m != other.m)
                intersect = true;
            else
                intersect = false;
        }
        
        else if(this.a == 1 || other.a == 1)
        {
            if(this.a == 1 && other.a == 1)
                intersect = true;
            else if(this.a != other.a)
                intersect = false;
        }
        
        return intersect;
    }
    
    public boolean equals(LineProgram other)
    {
        if(this.a == other.a)
        {
            if(this.m == other.m && this.b == other.b)
                equals = true;
            else
                equals = false;
        }
        
        else
            equals = false;
            
        return equals;
    }
    
    public boolean parallel(LineProgram other)
    {
        if(this.m == other.m)
            parallel = true;
        else
            parallel = false;
            
        return parallel;
    }

    
    private double m;
    private double b;
    private double a;
    private boolean intersect;
    private boolean equals;
    private boolean parallel;
}
