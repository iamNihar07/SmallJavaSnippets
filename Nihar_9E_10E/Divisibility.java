

public class Divisibility
{
    void main(int a)
    { System.out.println("The no. is "+a);
        if(a%2==0 && a%5==0)
        {System.out.println("The no is divisible by 2 as well as 5.");}
        else if(a%2==0 && a%5!=0)
        {System.out.println("The no. is divisible by only 2.");}
        else if(a%2!=0 && a%5==0)
        {System.out.println("The no. is divisible by only 5.");}
        else if(a%2!=0 && a%5!=0)
        {System.out.println("The no. is divisible neither by 2 nor by 2.");}
    }
}