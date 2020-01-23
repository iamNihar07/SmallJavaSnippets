import java.io.*;
public class Amicable_nos
{ public static void main()throws IOException //finding amicable nos.
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter two Numbers");
        int x=Integer.parseInt(in.readLine());
        int y=Integer.parseInt(in.readLine());
        int i;
        int s=0;
        int a=0;
        for(i=1;i<=x;i++)
        { if (x%i==0) 
            { s=s+i;
              
            }            
        }
        for(i=1;i<=y;i++)
        { if (y%i==0) 
            { a=a+i;
              
            }
           
                   }
        if(s==a)
        { System.out.println("Amicable Nos."); }
        else
        { System.out.println("Not Amicable Nos.");}
    }
}

            
            
           