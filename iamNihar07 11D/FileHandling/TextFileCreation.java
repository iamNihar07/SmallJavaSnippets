package FileHandling;

import java.io.*;
public class TextFileCreation
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int i; String name;
        FileWriter fw=new FileWriter("11d.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);

        for(i=1;i<=3;i++)
        {
            System.out.println("Enter the name.");
            name=in.readLine();
            pw.println(name);
        }
        pw.close();
        bw.close();
        fw.close();
        System.out.println("Data written to the file...");
    }
} 
