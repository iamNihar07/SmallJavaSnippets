package Arrays;      
import java.io.*;    
public class Array_3
{                   
    static void main()throws IOException //checking roll no. and corresponding name.
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int m[]=new int[5];
        String name[]=new String[5];
        int k=0;
        int i=0;
        boolean flag=false;
        for(i=0;i<m.length;i++)
        {
            System.out.println("Enter the roll number.");
            m[i]=Integer.parseInt(in.readLine());
            System.out.println("Enter the name.");
            name[i]=in.readLine();
        }        

        System.out.println("Enter the no. to be checked for in the array.");
        int n = Integer.parseInt(in.readLine());

        for(i=0;i<m.length;i++)
        {
            if(m[i] == n)
            {
                flag = true;
                break;                
            }
        }
        if(flag==true)
        {
            System.out.println("Roll no found"+"\n"+m[i]+"."+name[i]);
        }
        else
        {
            System.out.println("Roll no. "+n+" not found.");
        }
    }
}

