
public class Coordenada
{
    private double x;
    private double y;
   

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;

    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }
    
    public void setY(double y)
    {
        this.y = y;
    }

    public String toStiString()
    {
        toStiString( x + "," + y);
    }

    public boolean equals(Object o)
    {
        Coordenada f2 = (Coordenada)o;
        return (x==f2.x) && (y==f2.y);

    }
}