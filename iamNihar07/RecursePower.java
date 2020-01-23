import java.util.*;
public class RecursePower
{
    int pow(int a,int b)
    {     
        int res=a;
        if(b==1)
        {
            return res;
        }
        return res*pow(a,b-1);
    }

    static void main()
    {
        RecursePower ob=new RecursePower();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int no=sc.nextInt();
        System.out.println("Enter the power.");
        int power=sc.nextInt();
        System.out.println("Power= "+ob.pow(no,power));
    }
}
