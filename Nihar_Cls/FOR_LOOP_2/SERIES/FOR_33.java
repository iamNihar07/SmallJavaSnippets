package FOR_LOOP_2.SERIES;

public class FOR_33
{
    void main()
    {
        int i=0;
        int a;
        int b;
        
    
        double sum1=0;
        double sum2=0;
        for(a=5;a<=9;a++)
        {
            
            sum1=sum1+a;
        }
        for(b=9;b<=17;b+=2)
        {  sum2=sum2+b;
        }
        System.out.println(sum1-sum2);
    }
}