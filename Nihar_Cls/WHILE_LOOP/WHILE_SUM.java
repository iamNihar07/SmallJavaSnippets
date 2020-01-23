package WHILE_LOOP;


import java.io.*;
public class WHILE_SUM
{
   static void main()throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in= new BufferedReader(read);
       
       System.out.println("enter the number");
       int n=Integer.parseInt(in.readLine());
       
       int m=n;
       int s=0,a;
       
       while(n!=0)
       {
           a=n%10;
           s=s+a;
           n=n/10;
       }
       System.out.println("sum of digits="+s);
    }
}

