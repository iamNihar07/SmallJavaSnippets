package FOR_LOOP.SERIES;

public class SR_20
{
    void main()
    {
        int i;
        int m=3;
        int n=4;
        int d=25;
        for(i=1; i<=10; i++, m=m+1, n=n+1, d=d-2)
        {
            System.out.println(m+"*"+n+"/"+d);
        }
    }
}
