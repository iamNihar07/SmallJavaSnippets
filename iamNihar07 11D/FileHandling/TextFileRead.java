package FileHandling;
import java.io.*;
public class TextFileRead
{
    public static void main()throws IOException
    {
        String n;        
        try
        {
            FileReader fr=new FileReader("11d.txt");
            BufferedReader in=new BufferedReader(fr);

            System.out.println("Following are the details in the file:");
            while((n=in.readLine())!=null)
            {
                System.out.println(n);
            }
            in.close();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.err.println(e);
        }
    }
}
