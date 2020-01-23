package Board;
import java.io.*;
public class Filepath
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter the path");
        String path=in.readLine();
        
        
        int n1=path.lastIndexOf('/');
        System.out.println("Path "+path.substring(0,n1+1));
        int n2=path.lastIndexOf('.');
        System.out.println("File name "+path.substring(n1+1,n2));
        System.out.println("Extension "+path.substring(n2+1,path.length()));
    }
}
        