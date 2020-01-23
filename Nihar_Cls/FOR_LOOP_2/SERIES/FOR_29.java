package FOR_LOOP_2.SERIES;

public class FOR_29
{
    void main()
    {
        int i=0;
        int n;
        int d;
        int a;
        double s=0;
        for(i=1,n=25,d=5,a=3;i<=10;i++,a+=2,n+=2,d+=1)
        {
            
            s=s+(a*((double)n/d));
        }
        System.out.println(s);
    }
}