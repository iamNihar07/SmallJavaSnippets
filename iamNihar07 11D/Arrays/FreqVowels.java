package Arrays;
import java.io.*;
/**
 * Disp freq of vowels in each word of the array
 */
public class FreqVowels
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String a[]=new String[10];
        System.out.println("Enter the elements String");
        for(int i=0;i<10;i++)
        {
            a[i]=in.readLine();
        }

        for(int i=0; i<a.length;i++)
        {
            String f=a[i];
            int k=0;
            for(int j=0;j<f.length();j++)
            {
                char ch=f.charAt(j);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    k++;
                }    
            }
            System.out.println("No of vowels in "+f+" = "+k);
        }
    }
}