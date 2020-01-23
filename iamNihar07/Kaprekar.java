
public class Kaprekar
{
    boolean kaprekar(int no)
    {
        int sq=no*no;
        int t=sq;
        int k=0;
        while(t!=0)
        {
            t=t/10;
            k++;
        }
        int n1,n2;
        boolean f=false;
        int m=k/2;
        if(k%2==0)
        {
             n1=sq%((int)Math.pow(10,m));
             n2=sq/((int)Math.pow(10,m));
        }
        else
        {
            
             n1=sq%((int)Math.pow(10,m+1));
             n2=sq/((int)Math.pow(10,m+1));
        }
        if(n1+n2==no)
        {
            f=true;
        }
        else{
            f=false;
        }

        return f;
    }

    static void main()
    {
        Kaprekar ob=new Kaprekar();
        int i;
        for(i=1;i<1000;i++)
        {
            if(ob.kaprekar(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}
 