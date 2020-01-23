package Arrays;
import java.io.*;
public class Array_18

{
    static void main() throws IOException //City with rainfall ,searching using Binary Search
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String m[]=new String[10];
        int n[]=new int[10];
        int lb,ub,p,k;
        lb=0; ub=m.length-1; p=0; k=0;
        String ns="";
        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter the City.");
            m[i]=in.readLine();
            System.out.println("Enter its rainfall.");
            n[i]=Integer.parseInt(in.readLine());
        }

        
        System.out.println();
        System.out.println("Enter the city to be searched");
        ns=(in.readLine());

        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p].compareToIgnoreCase(ns)<0)
            {
                lb=p+1;
            }
            if(m[p].compareToIgnoreCase(ns)>0)
            {
                ub=p-1;
            }
            if(m[p].compareToIgnoreCase(ns)==0)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("City "+m[p]+" found with rainfall of "+n[p]);
        }
        else
        {
            System.out.println("City not found");
        }
    }
}

