package If_Condition;

public class If_8
{
    void main(double a,double b, double c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is tallest");
            }
            else 
            {
                System.out.println(c+"is tallest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+"is tallest");
            }

            else
            {   
                System.out.println(c+"is tallest");
            }
        }  

    }
}

