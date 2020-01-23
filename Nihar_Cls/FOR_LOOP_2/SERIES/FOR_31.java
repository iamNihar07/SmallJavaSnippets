package FOR_LOOP_2.SERIES;

public class FOR_31
{
    void main()
    {
        int i=0;
        int a;
        int b;
        
    
        double sum1=0;
        double sum2=0;
        for(a=1;a<=19;a+=2)
        {
            
            sum1=sum1+a;
        }
        for(b=2;b<=20;b+=2)
        {  sum2=sum2+b;
        }
        System.out.println(sum1-sum2);
    }
}