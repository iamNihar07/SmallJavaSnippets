package BoardPracticalPractise;
import java.util.*;

public class DayNo
{
    int dd,mm,yy;
    int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your DOB in dd mm yyyy format.");
        dd=sc.nextInt();
        mm=sc.nextInt();
        yy=sc.nextInt();
    }
    
    boolean checkValid()
    {
        boolean f=false;
        if(yy>0)
        {
            if(mm>=1 && mm<=12)
            {
                if(dd<=day[mm-1])
                {
                    f=true;
                }
            }
        }
        return f;
    }
    
    boolean isLeap()
    {
        if((yy%100==0 && yy%400==0) || (yy%100!=0 && yy%4==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    void getDayNo()
    {
        int dayno=0;        
        for(int i=0;i<mm-1;i++)
        {
            dayno=dayno+day[i];
        }        
        dayno=dayno+dd;
        System.out.println(dayno);
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            DayNo ob=new DayNo();
            ob.input();
            if(ob.isLeap())
            {
                ob.day[1]++;
            }
            if(ob.checkValid())
            {
                System.out.println("VALID DATE");
                ob.getDayNo();
            }
            else
            {
                System.out.println("INVALID DATE");
            }
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

        
        
                