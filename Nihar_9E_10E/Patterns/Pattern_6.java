package Patterns;
public class Pattern_6
{
    static void main()
    {   int i=0;
        int j=0;
        for(i=1;i<=5;i++)
        { for(j=5;j>=i;j--)
            { System.out.print(j);
            }
          System.out.println();
        }
    }
}