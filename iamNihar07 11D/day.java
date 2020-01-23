import java.io.*;
/**
 * WAP to accept the year and no.of days and display the date for those 
 * many no. of dates
 */
public class day
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int days[]={31,59,90,120,151,181,212,243,273,304,334,365};
        int lmonth[]={31,29,31,30,31,30,31,31,30,31,30,31};
        int ldays[]={31,60,91,121,152,182,213,244,274,305,335,366};
        System.out.println("Enter the year");
        int y=Integer.parseInt(in.readLine());
        System.out.println("Enter no.of days");
        int d=Integer.parseInt(in.readLine());        
        boolean flag=false;        
        int i=0; int mon=0; int dy=0;
        //65 165 367
        if(y%400==0 || (y%4==0 && y%100!=0)) //leap
        {
            if(d>0 && d<=366)
            {        
                int m=d;
                i=0;
                while(m>lmonth[i])
                {
                    m=m-lmonth[i];
                    i++;
                }
                mon=i+1;
                dy=m;
                System.out.println("The Date is "+dy+"/"+mon+"/"+y);
            }
            else if(d>366)
            {
                int m=d;                
                for(int j=4;j<=7;j++)
                {
                    if(j%4==0)
                    {
                        m=m-366;
                        y++;
                        if(m<=365)
                        {
                            int m1=d;
                            i=0;
                            y++;
                            while(m1>month[i])
                            {
                                m1=m1-month[i];
                                i++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                    }
                    else
                    {
                        m=m-365;
                        y++;
                        if(j%3==0 && m<=366)
                        {
                            int m1=d;
                            i=0;
                            y++;
                            while(m1>lmonth[i])
                            {
                                m1=m1-lmonth[i];
                                i++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                        else if(m<=365)
                        {
                            int m1=d;
                            i=0;
                            y++;
                            while(m1>month[i])
                            {
                                m1=m1-month[i];
                                i++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1-1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                    }
                }
            }
        }
        else //not leap year
        {
            if(d>0 && d<=365)
            {        
                int m=d;
                i=0;                
                while(m>month[i])
                {
                    m=m-month[i];
                    i++;
                    dy=m;
                    System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                } 
            }
            else if(d>=365)
            {
                int k=0; int k1=0;
                for(k=y;;k++)
                {
                    if(k%400==0 || (k%4==0 && k%100!=0))
                    {                        
                        break;
                    }
                }
                k1=k%4;
                if(k1==0)
                {
                    k1=4;
                }
                int m=d;
                for(int j=k1;;j++)
                {
                    if(j%4==0)
                    {
                        m=m-366;
                        y++;
                        if(m<=365)
                        {
                            int m1=d;
                            i=0;
                            y++;
                            while(m1>month[i])
                            {
                                m1=m1-month[i];
                                i++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                    }

                    else
                    {
                        m=m-365;
                        y++;
                        if(j%3==0 && m<=366)
                        {
                            int m1=d;
                            i=0;
                            y++;
                            while(m1>lmonth[i])
                            {
                                m1=m1-lmonth[i];
                                i++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                        else if(m<=365)   
                        {
                            int m1=d;
                            i=0;
                            while(m1>month[i])
                            {
                                m1=m1-month[i];
                                i++;
                                y++;
                                if(i==12)
                                {
                                    i=0;
                                }
                            }
                            mon=i+1;
                            dy=m1-1;
                            System.out.println("The Date is "+dy+"/"+mon+"/"+y);
                            break;
                        }
                    }
                }
            }
        }
    }
}

                    