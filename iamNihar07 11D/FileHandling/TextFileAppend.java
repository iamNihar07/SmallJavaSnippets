package FileHandling;
import java.io.*;
public class TextFileAppend
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String name;
        String ans;

        FileWriter fw=new FileWriter("11d.txt.",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);

        do
        {
            System.out.println("Enter name.");
            name=in.readLine();
            pw.println(name);
            System.out.println("Do you want to continue? (y/n) ?");
            ans=in.readLine();
        }while(ans.equalsIgnoreCase("y"));
        pw.close();
        bw.close();
        System.out.println("Data written to the file...");
    }
}


