
import java.io.*;
public class Security_staff
{
    void main() throws IOException
    { InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a= 0;
        System.out.println("Enter hours worked");
        a=Integer.parseInt(in.readLine());
        int x=1000;
        int y=x+(1250*(a-48));
        int z=(x)+(y)+((a-8)*1500);
        if (a<=48)
        
        
        { 
            System.out.println("Your tarrif is rupees "+x);
        }
        else if(a>48 && a<=56)
        { 
            System.out.println("Your tarrif is rupees "+y);
        }
        else if(a>56)
        { 
            System.out.println("Your tarrif is rupees "+z);
        }
    }
}
