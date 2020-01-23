import java.io.*;
public class Pallindrome
{
    public static void main()throws IOException //Pallindrome
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,x,nn=0,r=0;
        System.out.println("Enter a Number");
        n=Integer.parseInt(in.readLine());
        nn=n;
        while(nn!=0)
        {
            x=nn%10;
            r=r*10+x;
            nn=nn/10;
        }
        if(r==n)
            System.out.println("Pallindrome ");
        else
            System.out.println("Not A Pallindrome ");
    }
}