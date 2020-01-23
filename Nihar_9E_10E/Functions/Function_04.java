package Functions;

import java.io.*;
public class Function_04 //impure fuction finding area
{
    static void calc_area(int s)
    {
        int area=s*s;
        System.out.println("Area = "+area);
    }

    static void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the number.");
        int a=Integer.parseInt(in.readLine());
        calc_area(a);

    }

}