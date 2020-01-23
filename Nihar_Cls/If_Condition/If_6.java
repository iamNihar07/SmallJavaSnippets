package If_Condition;

public class If_6
{
    void main(double a,double b,double c)
    {
        if(a==b && b==c)
        {
            System.out.println("Triangle is equilateral triangle");
        }
        else if(a==b || a==c || b==c)
        { 
            System.out.println("Triangle is iscoceles"); 
        }
        else
        {
            System.out.println("Triangle is scalene");
        }
    }
}
