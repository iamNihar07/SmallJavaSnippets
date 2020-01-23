import java.io.*;
public class List
{ 
    public static void main ()throws IOException //LIST
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int n;
        int se=0; 
        int so=0;
        int sn=0;

        do
        { 
            System.out.println("Enter the no. one by one.");
            n = Integer.parseInt(in.readLine());
            if(n%2==0 && n>0)
            { se=se+n; }
            if(n%2!=0 && n>0)
            { so=so+n; }
            if (n<0)
            { sn=sn+n; }
        }
        while(n!=0);
        System.out.println(" Sum of all Positive even nos. is "+se);
        System.out.println(" Sum of all Positive odd nos. is "+so);
        System.out.println(" Sum of all Negative nos. is "+sn);
    }
}

            
            
        
