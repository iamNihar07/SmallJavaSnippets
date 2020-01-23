import java.util.*;
public class RecurseFact
{
    long factorial(int no)
    {
        if(no<2)
        {
            return 1;
        }
        return no*factorial(no-1);
    }
    static void main()
    {
        RecurseFact ob=new RecurseFact();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        System.out.println("Factorial= "+ob.factorial(n));        
    }
} 
