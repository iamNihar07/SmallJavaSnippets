import java.io.*;
public class Copy
{

    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter a number.");
        double d=Double.parseDouble(in.readLine());
        System.out.println("Enter a number.");
        float f=Float.parseFloat(in.readLine());
        System.out.println("Enter a word.");
        String s = in.readLine();
        System.out.println("Enter a character");
        char ch= in.readLine().charAt(0);
    }
}

        