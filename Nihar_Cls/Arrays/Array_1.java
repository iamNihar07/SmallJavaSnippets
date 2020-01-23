package Arrays;  
                     // There are 3 ways of accepting an array.
import java.io.*;    // 1. The method used.
public class Array_1 // 2. int n[]={1,2,3,4,5};
{                    // 3. function arguement - void main(int n[])
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int m[]=new int[5];
        
        System.out.println("Enter 5 values.");
        for(int i=0;i<m.length;i++)
        {
            m[i] = Integer.parseInt(in.readLine());
        }
        System.out.println(" The values are ");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
}

