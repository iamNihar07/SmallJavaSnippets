
public class random
{
    static void main()
    {
        int k=0;
        while(true)
        {
            int a=(int)((1000-100)*Math.random());
            if(a%100==0)
            {                
                k++;                
            }    
            if(k==10000000)
            {
                System.out.println("I WIN "+a);
                break;
            }
        }
    }
}