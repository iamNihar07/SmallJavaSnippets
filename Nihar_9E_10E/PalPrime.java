import java.io.*;
public class PalPrime 
{ public static void main()throws IOException //pal prime
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a=0;
        int x=a;
        int nn=0;
        int r=0;
        System.out.println("Enter a Number");
        x=Integer.parseInt(in.readLine());
        int i;
        boolean flag=true;
        for(i=2;i<x;i++)
        { 
            if(x%i==0)
            { flag=false;
                break; 
            }
        }
        while(nn!=0)
        {
            x=r%10;
            nn=nn*10+x;
            x=x/10;
        }
        if(a==nn && flag==true)
        {
            System.out.println(x+" is a PalPrime no. ");}
        else
        {
            System.out.println(x+" isn't a PalPrime no. ");}
    }
}