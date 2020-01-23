package FOR_LOOP.SERIES;

public class SR_19
{
    void main()
    {
        int i;
        int n=25;
        int d=5;
        for(i=1; i<=10; i++, n=n-2, d=d+1)
        {
            System.out.println(n+"/"+d);
        }
    }
}
