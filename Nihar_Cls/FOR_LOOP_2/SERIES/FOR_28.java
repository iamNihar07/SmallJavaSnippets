package FOR_LOOP_2.SERIES;

public class FOR_28
{
    void main()
    {
        int i=0;
        int n=25;
        int d=5;
        double s=0;
        for(i=1,n=25,d=5;i<=10;i++,d++,n+=2)
        {
            s=s+((double)n/d);
            
        }
        System.out.println(s);
    }
}