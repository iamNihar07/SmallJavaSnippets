package FOR_LOOP_2.SERIES;


public class FIBONACCI
{
    void main()
    {
        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=13;i++)
        {

            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
