package BasicPrograms;
import java.io.*;
/**
 * WAP to accept CP and SP of an article from the user. Check and display if the user has made a profit or loss
 * also display the profit percentage or loss p
 */
public class ProfitLoss
{
    static void main() throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the C.P ");
        int cp=Integer.parseInt(in.readLine());
        System.out.println("Enter the S.P ");
        int sp=Integer.parseInt(in.readLine());

        if(cp<sp)
        {
            System.out.println("Profit= "+(sp-cp));
            System.out.println("Profit Percentage = "+((double)(sp-cp)/(double)cp)*100);
        }
        else if(sp<cp)
        {
            System.out.println("Loss= "+(cp-sp));
            System.out.println("Loss Percentage = "+((double)(cp-sp)/(double)cp)*100);
        }
        else
        {
            System.out.println("NO PROFIT NO LOSS");
        }
    }
}