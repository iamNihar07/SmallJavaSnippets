package Arrays;
import java.io.*;
public class Array_04
{
    static void main() throws IOException //roll number, name, division, percentage
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int rn[]=new int[5];
        String name[]=new String[5];
        char div[]=new char[5];
        double per[]=new double[5];

        for(int i=0;i<rn.length;i++)
        {
            System.out.println("Enter The Roll No.");
            rn[i]=Integer.parseInt(in.readLine());
            System.out.println("Enter The Name.");
            name[i]=(in.readLine());
            System.out.println("Enter The Division.");
            div[i]=(in.readLine()).charAt(0);
            System.out.println("Enter The Percentage.");
            per[i]=Double.parseDouble(in.readLine());
        }

        int lb=0,ub=rn.length-1,cent=0;
        boolean flag=false;

        System.out.println("Enter the roll number to be searched for -");
        int ns=Integer.parseInt(in.readLine());

        while(ub>=lb)
        {
            cent = (lb+ub)/2;
            if(rn[cent]==ns)
            {
                flag=true;
                break;
            }
            if(rn[cent]<ns)
            {
                lb=cent+1;
            }
            if(rn[cent]>ns)
            {
                ub=cent-1;
            }
        }
        if(flag==true)
        {
            System.out.println("Roll number- "+rn[cent]+". "+"Name- "+name[cent]+
                " Division- "+div[cent]+" Percentage- "+per[cent]);
        }
        else
        {
            System.out.println("Roll number "+ns+" Not Found.");
        }
    }
}

    