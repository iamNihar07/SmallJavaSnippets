package If_Condition;

import java.io.*;

public class IF_12
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a=0;
        System.out.println("ENTER A NO. FROM 0-100");
        a=Integer.parseInt(in.readLine());
        if(a<10)
        {
            System.out.println("NO. IS A 1 DIGIT NO.");
        }
        else if (a<100)
        {
             System.out.println("NO. IS A 2 DIGIT NO.");
        }
        else if(a<1000)
        {
             System.out.println("NO. IS A 3 DIGIT NO.");
        }
        else
        {
            System.out.println("WRONG INPUT");
        }
    }
}
        