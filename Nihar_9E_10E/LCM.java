import java.io.*;
public class LCM
{ 
    public static void main ()throws IOException //LCM
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the two nos.");
        int x=Integer.parseInt(in.readLine());
        int y=Integer.parseInt(in.readLine());
        double a=Math.max(x,y);
        int h=0; int i;
        int p=x*y;
        for(i=1;i<a;i++)
        { if(x%i==0 && y%i==0)
            {  h = i;}
        }
        int LCM=p/h;
        System.out.println("LCM of " +x+" & " +y+" = "+LCM);
    }
}
     