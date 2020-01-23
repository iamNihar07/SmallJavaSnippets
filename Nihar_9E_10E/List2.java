import java.io.*;
public class List2
{ 
    public static void main ()throws IOException //LIST
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n=0;
        int sn=0;
        int sp=0;
        int k =0;
        

        while(n>=0)
        { System.out.println("Enter the no. one by one.");
          n = Integer.parseInt(in.readLine());
          k++;
          if(k<=11)
          { break;
            }
          if(n>0)
            { sp=sp+n;
              System.out.println("Sum of positive nos. is "+sp);}
            else if(n<0)
            { sn=sn+n;
              System.out.println("Sum of negative. is "+sn); }
              }        
    }
}
           
            

            
            
        
