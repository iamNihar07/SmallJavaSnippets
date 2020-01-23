
public class series
{
    static void main() //1+2-3+4-5+6...20
    {
        int sum1=0,sum2=0,sum=0;
        for(int i=1;i<=19;i+=2)
        {
            sum1=sum1+i;
        }
        for(int i=2;i<=20;i+=2)
        {
            sum2=sum2+i;
        }
        sum=sum1-sum2;
        System.out.println(sum);
    }
}