/**WAP to accept a no. Check and display if the no. is an odd or even.*/
package BasicPrograms;
import java.io.*;
public class OddEven
{
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    static void main()throws IOException
    {

        System.out.println("Enter a number.");
        int n=Integer.parseInt(in.readLine());

        if(n%2==0)
        {
            System.out.println("Even.");
        }
        else 
        {
            System.out.println("Odd.");
        }
    }
}