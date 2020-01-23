package Patterns;
public class Pattern_Prime
{
    static void main()
    {  
        int i=0;
        int j=0;
        int k=0;

        for(i=2;i<=100;i++)
        {
            k=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                { k++;
                  break;
                }
            }
            if(k==0)
            { System.out.println("Prime No -  "+i); 
            }                
            
        }
    }
}

       