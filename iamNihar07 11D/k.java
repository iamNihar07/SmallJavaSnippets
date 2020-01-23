

public class k
{
    static void main()
    {
        boolean x=false;
        do
        {
            System.out.println("Good Work!");
        }
        while(x);
        for(int i=1;i<=3;i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i);
        }
        int i,j;
        for(i=1,j=10;i<=3;i++,j--)
        {
            System.out.println(j+"\t"+i+"+\n");
        }
    }
}