
public class Circle extends Plane
{
    int x2,y2;
    double r,a;

    Circle(int x1, int y1, int x2, int y2)
    {
        super(x1,y1);        
        this.x2=x2;
        this.y2=y2;
    }

    void findRadius()
    {
        r= Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))/2;
        System.out.println("Radius = "+r);
    }

    void findArea()
    {
        a=3.14*r*r;
        System.out.println("Area = "+a);
    }

    public static void main()
    {
        Circle ob=new Circle(5,0,10,0);
        ob.show();
        ob.findRadius();
        ob.findArea();
    }
}


    