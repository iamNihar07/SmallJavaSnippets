package BasicPrograms;
import java.io.*;
/**
 * WAP to accept the length of the sides of a triangle. check and display
 * if the triangle is possible.
 */
public class Triangle2
{
    static void main()throws IOException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter the first side.");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter the second side.");
        int b=Integer.parseInt(in.readLine());
        System.out.println("Enter the third side.");
        int c=Integer.parseInt(in.readLine());
        
        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b))
        {
            System.out.println("Triangle Possible.");
        }
        else
        {
            System.out.println("Triangle not possible");
        }
    }
}	

        