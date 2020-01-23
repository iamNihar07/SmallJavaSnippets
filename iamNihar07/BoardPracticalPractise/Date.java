package BoardPracticalPractise;
import java.util.*;

public class Date
{
    int dayno;
    int y;
    int day[]={31,28,31,30,31,30,31,31,30,31,30,31};

    void input()
    {
        Scanner sc=new Scanner(System.in);        
        while(true)
        {
            System.out.println("Enter dayno");
            dayno=sc.nextInt();
            if(dayno>0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }

        while(true)
        {
            System.out.println("Enter the year");
            y=sc.nextInt();
            if(y>0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }

    }

    void getDate()
    {
        while(true)
        {
            if((y%400==0 && y%100==0) || (y%100!=0 && y%4==0))
            {
                day[1]=29;
                if(dayno>366)
                {
                    dayno=dayno-366;
                    y++;
                }
                else
                {
                    break;
                }
            }
            else
            {
                day[1]=28;
                if(dayno>365)
                {
                    dayno=dayno-365;
                    y++;
                }
                else
                {
                    break;
                }
            }
        }

        int m=0;
        for(int i=0;;i++)
        {
            if(dayno>day[i])
            {
                dayno=dayno-day[i];
                m++;
            }
            else            
            {
                m++;
                break;
            }
        }
        

        System.out.println("Date is "+dayno+" / "+m+" / "+y);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do
        {
            Date ob=new Date();
            ob.input();
            ob.getDate();

            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

    
                
    