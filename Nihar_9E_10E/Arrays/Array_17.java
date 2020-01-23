package Arrays;
import java.io.*;
public class Array_17
{
    static void main() throws IOException //Displaying max and min rainfall of the Array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String city[] = new String[10];
        double rainfall[] = new double[10];
        for(int i=0;i<city.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" cities");
            city[i]=in.readLine();
            System.out.println("Enter its rainfall");
            rainfall[i]=Double.parseDouble(in.readLine());
        }

        double max=rainfall[0],min=rainfall[0];
        int x=0,y=0;
        for(int i=0;i<city.length;i++)
        {
            if(rainfall[i]>max)
            {
                max=rainfall[i];
                x=i;
            }
            if(rainfall[i]<min)
            {
                min=rainfall[i];
                y=i;
            }
        }
        System.out.println("City with max rainfall is "+city[x]+" with rainfall of "+max);
        System.out.println("City with min rainfall is "+city[y]+" with rainfall of "+min);
    }
}

            
            