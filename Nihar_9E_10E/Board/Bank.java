package Board;
import java.io.*;
public class Bank
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);	
        System.out.println("(i) Term Deposit");
        System.out.println("(ii) Recurring Deposit");
        System.out.println("Enter your choice");
        int choice=Integer.parseInt(in.readLine());
        double r=0; int n=0;
        double a=0;
        switch(choice)
        {
            
            case 1:
            System.out.println("Enter the principal");
            float p=Float.parseFloat(in.readLine());
            System.out.println("Enter the rate of interest");
            r=Double.parseDouble(in.readLine());
            System.out.println("Enter the time period in years");
            n=Integer.parseInt(in.readLine());
            a=0;
            
            a=p*Math.pow((1+r/100),n);
            System.out.println(a);
            break;
            
            case 2:
            System.out.println("Enter the monthly installment");
            float P=Float.parseFloat(in.readLine());
            System.out.println("Enter the rate of interest");
            r=Double.parseDouble(in.readLine());
            System.out.println("Enter the time period in months");
            n=Integer.parseInt(in.readLine());
            a=0;
            
            a=(P*n) + (P*n*(n+1)/2 * r/100 * 1/12);
            System.out.println(a);
            break;
            
            default:
            System.out.println("Wrong choice.");
        }
    }
}

            