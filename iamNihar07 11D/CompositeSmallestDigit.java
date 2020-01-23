import java.io.*;
/**
 * Menu
 * 1.Composite
 * 2.Smallest Digit
 */
public class CompositeSmallestDigit
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("1. Check for Composite Number.");
        System.out.println("2. Check for smallest digit in a number.");
        System.out.println("Enter your choice.");
        int ch=Integer.parseInt(in.readLine());
        int n=0;
        switch(ch)
        {
            case 1:
            System.out.println("Enter a number.");
            n=Integer.parseInt(in.readLine());
            int k=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    k++;
                    break;
                }
            }
            if(k>0 && n!=1)
            {
                System.out.println("Composite number.");
            }            
            else
            {
                System.out.println("Not a Composite number.");
            }
            break;

            case 2:
            System.out.println("Enter a number.");
            n=Integer.parseInt(in.readLine());            
            int min=n%10;
            int a=0;
            while(n!=0)
            {
                a=n%10;
                if(a<min)
                {
                    min=a;
                }
                n=n/10;
            }
            System.out.println("The smallest digit is "+min);
            break;

            default:
            System.out.println("Wrong choice.");
        }
    }
}
