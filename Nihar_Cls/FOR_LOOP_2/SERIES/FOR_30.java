package FOR_LOOP_2.SERIES;

public class FOR_30
{
    void main()
    {
        int i=0;
        int a;
        int b;
    
        double s=0;
        for(i=1,a=1,b=2;i<=10;i++,a+=2,b+=2)
        {
            
            s=s+(a-b);
        }
        System.out.println(s);
    }
}