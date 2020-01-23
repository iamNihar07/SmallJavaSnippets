package BasicPrograms;
/**WAP to accept length and breadth of rect. Calc and display the perimeter with
*proper messages.
*/

import java.io.*;
public class Rect
{
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    static void main(int a, int c)throws IOException
    {

        System.out.println("Enter length.");
        int l=Integer.parseInt(in.readLine());
        System.out.println("Enter breadth.");
        int b=Integer.parseInt(in.readLine());
        int area=l*b;
        System.out.println("Area= "+area);
    }
}