package Arrays;
import java.io.*;
/**
 *Student Marks
 */
public class StudentMarks
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String name[]=new String[10];
        int m[]=new int[10];

        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter the name of the student.");
            name[i]=in.readLine();
            System.out.println("Enter the marks of the student.");
            m[i]=Integer.parseInt(in.readLine());
        }

        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(name[i].compareToIgnoreCase(name[j])>0)
                {
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                    int t=m[i];
                    m[i]=m[j];
                    m[j]=t;
                }
            }
        }

        System.out.println("Student \t Marks");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(name[i]+"\t"+m[i]);
        }
    }
}
