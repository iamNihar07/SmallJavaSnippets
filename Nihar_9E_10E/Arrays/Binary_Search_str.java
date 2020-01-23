package Arrays;
import java.io.*;
public class Binary_Search_str

{
    static void main() throws IOException //binary search with strings
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String m[]=new String[10];
        String ns="";
        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter your friends name (sorted)");
            m[i]=in.readLine();
        }
        
        int lb,ub,p,k;
        lb=0; ub=m.length-1; p=0; k=0;

        System.out.println();
        System.out.println("Enter your friends name to be searched");
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
            System.out.println("Name found. At index- "+p);
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}

