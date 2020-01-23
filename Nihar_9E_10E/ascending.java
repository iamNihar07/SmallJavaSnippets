public class ascending
{
    static void main()
    {
        int n=859992;
        int t=0; int a=0; int number=0;

        for(int i=0;i<=9;i++)
        {
            t=n;
            while(t!=0)
            {
                a=t%10;
                if(a==i)
                {
                    number=number*10+i;
                }
                t=t/10;
            }

        }
        System.out.println(number);
    }
}