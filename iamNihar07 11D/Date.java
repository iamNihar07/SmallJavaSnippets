import java.io.*;
/**
 * Date program
 */
public class Date
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter the year.");
        int y=Integer.parseInt(in.readLine());
        System.out.println("Enter the no. of days.");
        int d=Integer.parseInt(in.readLine());

        int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
        do
        {
            if(y%400==0 || (y%4==0 && y%100!=0))
            {
                m[1]=29;
                if(d>366)
                {
                    d=d-336;
                    y++;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(d>365)
                {
                    d=d-365;
                    y++;
                }
                else
                {
                    break;
                }
            }
        }while(true);
        
        int i=0;
        while(d>m[i])
        {
            d=d-m[i];
            i++;
        }
        
        System.out.println("The date is "+d+"/"+(i+1)+"/"+y);
    }
}
