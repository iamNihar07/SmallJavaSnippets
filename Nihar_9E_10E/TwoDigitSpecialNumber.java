import java.io.*;
public class TwoDigitSpecialNumber
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        
        
        System.out.println("Enter a 2 digit number");
        int n=Integer.parseInt(in.readLine());
        int m=n;int z=n;
        int k=0;
        int r=0,sum=0,product=1;
        
        while(z!=0)
        {
            z=z/10;
            k++;
        }
        if(k==2)
        {
            while(m!=0)
            {
                r=m%10;
                sum=sum+r;
                product=product*r;
                m=m/10;
            }
            if((sum+product)==n)
            {
                System.out.println("The no. "+n+" is a special 2 digit number.");
            }
            else
            {
                System.out.println("The no. "+n+" is not a special 2 digit number.");
            }
        }
        else
        {
            System.out.println("Number entered not a two digit number.");
        }
    }
}

    