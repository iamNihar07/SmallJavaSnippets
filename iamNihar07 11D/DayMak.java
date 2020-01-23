import java.io.*;
public class DayMak
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("This program is Created by Makarand Madhavi");
        System.out.println("Enter The year");
        int y=0;
        do
        {
            try
            {
                y=Integer.parseInt(in.readLine());
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid year");
            }
            if(y>=1000 && y<=9999)
                break;
            else
                System.out.println("Please enter a valid year");
        }
        while(true);
        boolean leap=false;
        int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        boolean f=false;
        System.out.println("Enter No of days");
        int d=0;
        do
        {
            try
            {
                d=Integer.parseInt(in.readLine());
                f=false;
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid number");
                f=true;
            }            
        }
        while(f);
        do
        {
            if(y%4==0 && y%100!=0 || y%400==0)
            {
                m[1]=29;
                if(d>366)
                {
                    d=d-366;
                    y++;
                }
                else
                {
                    break;
                }  
            }
            else
            {
                m[1]=28;
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
        }
        while(true);
        int i=0;
        while(d>m[i])
        {
            d=d-m[i];
            i++;
        }
        System.out.println(d+" "+month[i]+" "+y);
    }
}
    