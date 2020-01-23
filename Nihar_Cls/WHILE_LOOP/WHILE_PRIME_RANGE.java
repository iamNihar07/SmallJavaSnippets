package WHILE_LOOP;

public class WHILE_PRIME_RANGE
{
    void main() 
    {

        long n=0;

        long i; 
        for(n=2;n<=100;n++)
        { 
            boolean flag=true;
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            {   
                System.out.println(n+" IS A PRIME N0.");
            }  
        }
    }
}