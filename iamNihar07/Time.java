import java.io.*;
public class Time
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    int h,m;

    Time()
    {
        h=1;
        m=30;
    }

    void input()throws IOException
    {
        System.out.println("Enter the no.of hours");
        h=Integer.parseInt(in.readLine());
        System.out.println("Enter the no.of minutes.");
        m=Integer.parseInt(in.readLine());
    }

    void display()
    {
        System.out.println("Total no. of hours= "+h+" minutes = "+m);
    }

    /*#void addTime(Time t) //First version - local object
    {
        Time added=new Time();
        added.h=h + t.h;
        added.m=m + t.m;
        if(added.m>=60)
        {
            added.h++;
            added.m=added.m-60;
        }
        added.display();
    }*/
    
    Time addTime(Time t) //second version - passing the object
    {
        Time added=new Time();
        added.h=h + t.h;
        added.m=m + t.m;
        if(added.m>=60)
        {
            added.h++;
            added.m=added.m-60;
        }
        return added;
    }
    
    public static Time addTime(Time tm1, Time tm2)    //Third version making static and call on cls name
    {
        Time added=new Time();
        added.h=tm1.h + tm2.h;
        added.m=tm1.m + tm2.m;
        if(added.m>=60)
        {
            added.h++;
            added.m=added.m-60;
        }
        return added;
    }

    static void main()throws IOException
    {
        Time t1=new Time();
        Time t2=new Time();
        t1.input();
        t1.display();
        t2.input();
        t2.display();
        //t1.addTime(t2); for first version
        Time t1t2=t1.addTime(t2); //second version
        t1t2.display(); //second version
        Time x=Time.addTime(t1,t2); //calling on class name
        x.display();
    }
}

        