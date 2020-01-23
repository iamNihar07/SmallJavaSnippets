package Arrays;      
import java.io.*;    
public class Array_4
{                   
    static void main()throws IOException //finding country and capital.
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String m[]=new String[5];
        String m1[]=new String[5];
        int k=0;
        int i=0;
        boolean flag=false;
        for(i=0;i<m.length;i++)
        {
            System.out.println("Enter the country.");
            m[i]=in.readLine();
            System.out.println("Enter its capital");
            m1[i]=in.readLine();
        }        

        System.out.println("To find out the capital, enter the country");
        String n = in.readLine();

        for(i=0;i<m.length;i++)
        {
            if(m[i].equalsIgnoreCase(n))
            {
                flag = true;
                break;                
            }
        }
        if(flag==true)
        {
            System.out.println(m[i]+"'s capital is "+m1[i]);
        }
        else
        {
            System.out.println("Country "+n+" not found");
        }
    }
}

