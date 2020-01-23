package pattern_2;

public class pat_8
{
    static void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(j%2==1)
                {
                    System.out.print(1);
                }
                else
                {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

            