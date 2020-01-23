package BasicPrograms;
import java.io.*;
/**
 * WAP to accept the length of the sides of a triangle. check and display
 * if the triangle is an isos, scal or equi.
 */
public class Triangle1
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
        
        if(a==b && b==c)
        {
            System.out.println("Equilateral Triangle.");
        }
        else if((a==b && a!=c) || (a==c && a!=b))
        {
            System.out.println("Isosceles Triangle.");
        }
        else
        {
            System.out.println("Scalene Triangle.");
        }
    }
}
    