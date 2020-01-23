package Arrays;
import java.io.*;
/**
 * Display the freq of a number entered by the user
 */
public class FreqNumber
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        int a[]=new int[10];         
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=Integer.parseInt(in.readLine());
        }
        
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        int k=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                k++;
            }
        }
        
        System.out.println("Freq is "+k);
    }
}
        

    

    