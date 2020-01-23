package Board;
public class Overload
{
    double area(double a, double b, double c)
    {
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
    double area(int a, int b, int height)
    {
        double area=1.0/2.0*height*(a+b);
        return area;
    }
    
    double area(double diag1, double diag2)
    {
        double area=1.0/2.0*diag1*diag2;
        return area;
    }
    
    static void main()
    {
        Overload ob=new Overload();
        double ar=0;
        ar=ob.area(5.0,6.0,7.0);
        System.out.println(ar);     
        ar=ob.area(5,7,6);
        System.out.println(ar); 
        ar=ob.area(5.5,2.0);
        System.out.println(ar); 
        
    }
}
        