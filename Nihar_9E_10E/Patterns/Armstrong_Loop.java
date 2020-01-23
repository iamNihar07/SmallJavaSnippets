package Patterns;
public class Armstrong_Loop
{ 
    static void main()//armstrong no.
    {   
        
        
        for(int i=2;i<=1000;i++)
        {
            int k=i;
            int r=0;        
            int nn=0;
            
            while(k!=0)
            {   
                r=k%10;
                nn=nn+(r*r*r);
                k=k/10;
            }
            if(nn==i)
            { 
                System.out.println(i+" Armstrong no.");
            }
        }
    }
}
