package WHILE_LOOP;

import java.io.*;
public class WHILE_ARMSTRONG
{
   static void main()throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in= new BufferedReader(read);
       
       System.out.println("enter the number");
       int n=Integer.parseInt(in.readLine());
       
       int m=n;
       int s=0,a,cb;
       
       while(n!=0)
       {
           a=n%10;
           cb=a*a*a;
           s=s+cb;
           n=n/10;
       }
       if(s==m)
       {
           System.out.println("armstrong no.");
       }
       else
       {
           System.out.println("not an armstrong no.");
       }
    }// END OF MAIN
}// END OF CLASS
// V(VARIABLES)  I(INDENTATION)
// S(SPACEOUT)   CO(COMMENT)