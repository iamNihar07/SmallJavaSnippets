import java.io.*;
public class Qaudratic
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter A");
        double a=Double.parseDouble(in.readLine());
        System.out.println("Enter B");
        double b=Double.parseDouble(in.readLine());
        System.out.println("Enter C");
        double c=Double.parseDouble(in.readLine());
        double D=(b*b)-(4*a*c);

        if(D>=0)
        {
            double alpha=(-b+(Math.sqrt(D)))/2*a;
            double beta=(-b-(Math.sqrt(D)))/2*a;

            System.out.println("Alpha = "+alpha);
            System.out.println("Beta = "+beta);
        }
        else
        {
            System.out.println("Imaginary Roots exist");
        }
    }
}
