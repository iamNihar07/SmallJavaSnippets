

public class Triangle
{
    void main(int a,int b,int c)
    {  if(a==b && a==c && b==c)
        {System.out.println("The triangle is equilateral.");}
       else if(a==b || a==c || b==c )
       {System.out.println("The triangle is isosceles.");}
       else if(a!=b && a!=c && b!=c)
       {System.out.println("The triangle is scalene.");}
    }
}