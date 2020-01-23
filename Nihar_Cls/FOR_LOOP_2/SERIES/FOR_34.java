package FOR_LOOP_2.SERIES;

public class FOR_34
{
    void main()
    {
        int i;
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (i=1;i<=7;i++)
        { c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}