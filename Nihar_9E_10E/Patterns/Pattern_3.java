package Patterns;
public class Pattern_3
{
    static void main()
    {   int i=0;
        int j=0;
        for(i=5;i>=1;i--)
        { 
            for(j=1;j<=i;j++)
            { 
                System.out.print(i+" ");
            }
          System.out.println();
        }
    }
}