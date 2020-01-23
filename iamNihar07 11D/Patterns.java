/**
 * 4 patterns of Notebook
 * 
 * 5.1 3 5 7 9 11  6.01          
 *  1 3 5 7          03 2
 *  1 3              06 5 4
 *  1                10 9 8 7
 */
public class Patterns
{
    static void main1()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main2()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main3()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void main4()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void main5()
    {        
        for(int i=11;i>=-1;i-=4)
        {
            if(i==-1)
            {
                i=1;
            }
            for(int j=1;j<=i;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }

    static void main6()
    {        
        int n=1;
        for(int i=1;i<=7;i=(i+n))
        {
            n++;
            if(i==1)
            {
                n=1;
            }
            for(int j=i+(n-1);j>=i;j--)
            {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}

        