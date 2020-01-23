import java.util.*;
public class Day
{
    int y;
    int dayno;
    static Scanner sc=new Scanner(System.in);
    int Day[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int month[]={1,2,3,4,5,6,7,8,9,10,11,12};

    void input()
    {
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
                System.out.println("INvalid input");
            }
        }

        System.out.println("Enter the dayno.");
        dayno=sc.nextInt();        
    }

    void getDate()
    {
        while(true)
        {
            if((y%100==0 && y%400 ==0) || (y%100!=0 && y%4==0))
            {
                Day[1]=29;
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
                Day[1]=28;
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
        
        int i=0;
        while(dayno>Day[i])
        {
            dayno=dayno-Day[i];
            i++;
        }
        
        System.out.println("Date is "+dayno+"/"+month[i]+"/"+y);
    }
    
    public static void main()
    {
        Day ob=new Day();
        ob.input();
        ob.getDate();
    }
}
        
        
