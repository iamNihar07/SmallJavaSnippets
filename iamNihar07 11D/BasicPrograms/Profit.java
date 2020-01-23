package BasicPrograms;
import java.io.*;
/**
 * WAP to accept the CP and SP and display the profit
 
 */
public class Profit
{    
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    static void main()throws IOException
    {
        System.out.println("Enter CP.");
        int cp=Integer.parseInt(in.readLine());
        System.out.println("Enter SP.");
        int sp=Integer.parseInt(in.readLine());
        int pl=0;
        if(cp>sp)
        {
            pl=cp-sp;
            System.out.println("Loss ="+pl);
        }
        else if(sp>cp)
        {
            pl=sp-cp;
            System.out.println("Profit ="+pl);
        }
        else
        {
            System.out.println("NO PROFIT NO LOSS ");
        }
    }
}