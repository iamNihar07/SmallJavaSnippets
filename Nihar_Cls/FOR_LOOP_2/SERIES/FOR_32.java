package FOR_LOOP_2.SERIES;

public class FOR_32
{
    void main()
    {
        int i=0;
        int a;
        int b;
        
    
        double sum1=0;
        double sum2=0;
        for(a=2;a<=18;a+=4)
        {
            
            sum1=sum1+a;
        }
        for(b=4;b<=20;b+=4)
        {  sum2=sum2+b;
        }
        System.out.println(sum1-sum2);
    }
}