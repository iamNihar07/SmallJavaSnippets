package Functions;

import java.io.*;

public class Function_01 //finding area of square
{
    static int area(int x) //formal parameter (called function. pure function)
    {
        int ar=x*x;
        System.out.println("Area= "+ar);
        return ar;
    }
    static void main()throws IOException //calling function
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the value of side.");
        int s=Integer.parseInt(in.readLine()); //actual parameter
        int a=area(s); //function call
        System.out.println("Area = "+a);
        System.out.println("s = "+s);
    }
}

