

package WHILE_LOOP;

import java.io.*;
public class WHILE_PALINDROME
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
           s=s*10+a;
           n=n/10;
       }
       if(s==m)
       {
           System.out.println("palindrome no.");
       }
       else
       {
           System.out.println("not a palindrome no.");
       }
    }// END OF MAIN
}// END OF CLASS
// V(VARIABLES)  I(INDENTATION)
// S(SPACEOUT)   CO(COMMENT)