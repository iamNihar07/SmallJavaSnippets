package If_Condition;
import java.io.*;
public class IF_13
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        double fb=0,d=0,cp=0;
        boolean flag = true;
        System.out.println("ENTER COST PRICE");
        cp=Integer.parseInt(in.readLine());
        if(cp>=0 && cp<1001)
        {
            d=cp*0.1;
            System.out.println("discount is"+d);
        }
        else if (cp>1000 && cp<3001)
        {
            d=cp*0.15;
             System.out.println("discount is"+d);
        }
        else if(cp>3000 && cp<5001)
        {
            d=cp*0.2;
             System.out.println("discount is"+d);
        }
        else if(cp>5000)
        {
            d=cp*0.5;
             System.out.println("discount is"+d);
        }
        else
        {
            System.out.println("WRONG INPUT");
            flag=false;
        }
        if(flag==true)
        {
             fb=cp-d;
             System.out.println("Final bill is RS."+fb);
        }
        }
    }
 
        

