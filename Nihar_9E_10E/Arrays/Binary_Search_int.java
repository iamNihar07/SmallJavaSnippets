package Arrays;
import java.io.*;
public class Binary_Search_int

{
    static void main() throws IOException //binary search with integers
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m[]={11,22,33,55,55,55,77,88,99};
        int lb,ub,p,ns,k;
        lb=0; ub=m.length-1; p=0; k=0;

        System.out.println("The array m - 11,22,33,55,55,55,77,88,99");
        System.out.println();
        System.out.println("Enter the number to be searched");
        ns=Integer.parseInt(in.readLine());

        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<ns)
            {
                lb=p+1;
            }
            if(m[p]>ns)
            {
                ub=p-1;
            }
            if(m[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("Number found. At index- "+p);
        }
        else
        {
            System.out.println("Number not found");
        }
    }
}

