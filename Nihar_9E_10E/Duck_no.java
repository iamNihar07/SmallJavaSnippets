import java.io.*;
public class Duck_no
{ public static void main()throws IOException //duck no
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a Number");
        int x=Integer.parseInt(in.readLine());
        int r=0;
        int n=0;
        while(n!=0)
        {   r=x%10;
            n=n*10+r;
            x=x/10;
            

        }
        if(r==0)
            {System.out.println("Duck no.");}
            else
            {System.out.println("NOt a duck no.");}
    }
}
