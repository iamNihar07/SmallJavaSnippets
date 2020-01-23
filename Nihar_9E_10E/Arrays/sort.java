package Arrays;
import java.io.*;
public class sort

{
    static void main() throws IOException //Selection Sort in descending
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int rain[]=new int[10];
        String city[]=new String[10];
        for(int i=0;i<rain.length;i++)
        {
            System.out.println("Enter the city");
            city[i]=in.readLine();
            System.out.println("Enter the rainfall");
            rain[i]=Integer.parseInt(in.readLine());            
        }
         int min=0; int t=0; String t1="";
        for(int i=0;i<rain.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<rain.length;j++)
            {
                if(rain[j]>rain[min])
                {
                    min=j;
                }

            }
            t=rain[i];
            rain[i]=rain[min];
            rain[min]=t;
            t1=city[i];
            city[i]=city[min];
            city[min]=t1;
        }
        
        System.out.println("City"+"\t"+"Rainfall(in mm)");
        for(int i=0;i<rain.length;i++)
        {
            System.out.println(city[i]+"\t"+rain[i]);
        }
    }
}
