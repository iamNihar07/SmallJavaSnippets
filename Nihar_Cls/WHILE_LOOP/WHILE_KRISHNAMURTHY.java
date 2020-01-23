package WHILE_LOOP;

import java.io.*;
public class WHILE_KRISHNAMURTHY
{
   static void main()throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in= new BufferedReader(read);
       
       System.out.println("enter the number");
       int n=Integer.parseInt(in.readLine());
       
       int m=n;
       int s=0,a,f=1,i=1;
       
       while(n!=0)
       {
            f=1;
            i=1;
           a=n%10;
          
           while(i<=a)
           {
               f=f*i;
               i++;
           }
           
           s=s+f;
           n=n/10;
       }
       if(s==m)
       {
           System.out.println("krrishnamurthy no.");
       }
       else
       {
           System.out.println("not a krrishnamurthy");
       }
    }// END OF MAIN
}// END OF CLASS
// V(VARIABLES)  I(INDENTATION)
// S(SPACEOUT)   CO(COMMENT)