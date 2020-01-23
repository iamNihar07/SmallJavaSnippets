import java.io.*;
public class FiboString
{
    String x,y,z;
    int n;

    FiboString()
    {
        x="a";
        y="b";
        z="ba";
    }

    void accept()throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter n:");
        n=Integer.parseInt(in.readLine());
    }

    void generate()
    {   
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                System.out.print(x);
            }
            else if(i==2)
            {
                System.out.print(", "+y);
            }
            else
            {
                z=y+x;
                System.out.print(", "+z);
                x=y;
                y=z;
            }
        }
    }

    void main() throws IOException
    {
        FiboString ob=new FiboString();
        ob.accept();
        ob.generate();
    }
}

