package BasicPrograms;
import java.io.*;
public class Switch
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        while(true)
        {
            boolean flag=true;
            try
            {
                System.out.println("1.Add.");
                System.out.println("2.Subtract");
                System.out.println("3.Multiplication");
                System.out.println("4.Division.");
                System.out.println("5.Remainder");
                System.out.println("Enter your choice");
                int ch=Integer.parseInt(in.readLine());

                int a=0,b=0;
                if(ch>0 && ch<6)
                {
                    System.out.println("Enter first number.");
                    a=Integer.parseInt(in.readLine());
                    System.out.println("Enter second number.");
                    b=Integer.parseInt(in.readLine());
                }

                switch(ch)
                {
                    case 1:
                    System.out.println("Sum is "+(a+b));
                    break;

                    case 2:
                    System.out.println("Difference is "+(a-b));
                    break;

                    case 3:
                    System.out.println("Product is "+(a*b));
                    break;

                    case 4:
                    System.out.println("Quotient is "+(a/b));
                    break;

                    case 5:
                    System.out.println("Remainder is "+(a%b));
                    break;

                    default:
                    System.out.println("Wrong choice.");
                    System.out.println();
                    flag=false;
                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter integers only.");
                flag=false;
            }
            
            if(flag==true)
            {
               break;
            }
            else
            {
            }
        }
    }
}
