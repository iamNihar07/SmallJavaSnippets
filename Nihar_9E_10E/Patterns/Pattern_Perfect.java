package Patterns;
public class Pattern_Perfect
{
    static void main()
    {  
        int i=0;
        int j=0;
        int k=0;
        int s=0;

        for(i=2;i<=100;i++)
        {
            s=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                { s=s+j;
                  
                }
            }
            if(s==i)
            { System.out.println("Perfect[ No -  "+i); 
            }                
            
        }
    }
}

       