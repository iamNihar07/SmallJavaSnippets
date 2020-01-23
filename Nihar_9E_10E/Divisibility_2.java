public class Divisibility_2
{
    void main(int a)
    { System.out.println("The no. is "+a);
        if(a%4==0 && a%6==0)
        {System.out.println("The no is divisible by 4 as well as 6.");}
        else if(a%4==0 && a%6!=0)
        {System.out.println("The no. is divisible by only 4.");}
        else if(a%6==0 && a%4!=0)
        {System.out.println("The no. is divisible by only 6.");}
        else if(a%4!=0 && a%6!=0)
        {System.out.println("The no. is divisible neither by 4 nor by 6.");}
    }
}