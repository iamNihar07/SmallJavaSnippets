import java.io.*;

public class ASCII
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new  BufferedReader (read);

        System.out.println("Enter the first character");
        char a = in.readLine().charAt(0);
        System.out.println("Enter the second character");
        char b = in.readLine().charAt(0);

        int x=(int)a+(int)b;
        int y=(int)a-(int)b;

        System.out.println("The sum of ASCII values is "+x);
        System.out.println("The diff of ASCII values is "+y);
    }
}

      
       