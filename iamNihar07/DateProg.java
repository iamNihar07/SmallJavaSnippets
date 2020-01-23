import java.io.*;
public class DateProg
{    
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    int Day[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int LDay[]={31,29,31,30,31,30,31,31,30,31,30,31}; // diff is here. additional isLeap() used in Dayprog2
    int d,m,y;

    DateProg()
    {
        d=1;
        m=1;
        y=1980;
    }

    void input()throws IOException
    {
        System.out.println("Enter the day month year one by one");
        d=Integer.parseInt(in.readLine());
        m=Integer.parseInt(in.readLine());
        y=Integer.parseInt(in.readLine());
    }

    boolean isLeap()
    {
        if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean check()
    {
        boolean flag=false;
        if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0))
        {
            if(m>=1 && m<=12)
            {
                if(d<=LDay[m-1])
                {
                    flag=true;
                }                
            }
        }
        else
        {
            if(m>=1 && m<=12)
            {
                if(d<=Day[m-1])
                {
                    flag=true;
                }                
            }            
        }

        return flag;
    }

    void getDayNo()
    {
        int dayno=0;
        if((y%100==0 && y%400==0) || (y%100!=0 && y%4==0))
        {
            for(int i=1;i<m;i++)
            {
                dayno=dayno+LDay[m-1];
            }
            dayno=dayno+d;
        }
        else
        {
            for(int i=1;i<m;i++)
            {
                dayno=dayno+Day[i-1];
            }
            dayno=dayno+d;
        }

        System.out.println("Dayno= "+dayno);
    }

    static void main()throws IOException
    {
        DateProg ob=new DateProg();
        ob.input();        
        boolean f=ob.check();
        if(f==true)
        {
            System.out.println("Valid date.");
            ob.getDayNo();
        }
        else
        {
            System.out.println("Invalid date.");
        }
    }
}

    