package Arrays;

import java.io.*;
/**
 *Student Telephone
 */
public class StudentTelephone
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String a[]=new String[3];
        String b[]=new String[3];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the name of the student.");
            a[i]=in.readLine();
            System.out.println("Enter the telephone of the student.");
            b[i]=in.readLine();
        }
        boolean flag=true;
        System.out.println("Enter the name to be searched.");
        String f=in.readLine();
        String x="",y="";
        for(int i=0; i<a.length;i++)
        {
            if(f.equalsIgnoreCase(a[i]))
            {
                flag=true;
                x=f;
                y=b[i];
                break;
            }
        }

        if(flag==true)
        {
            System.out.println("Student "+x+" Telephone number "+y);
        }
        else
        {
            System.out.println("Student not found");
        }
    }
}
