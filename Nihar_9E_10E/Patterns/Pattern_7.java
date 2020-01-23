package Patterns;
public class Pattern_7
{
    static void main()
    {   int i=0;
        int j=0;
        for(i=1;i<=9;i+=2)
        { for(j=1;j<=i;j+=2)
            { System.out.print(j);
            }
          System.out.println();
        }
    }
}