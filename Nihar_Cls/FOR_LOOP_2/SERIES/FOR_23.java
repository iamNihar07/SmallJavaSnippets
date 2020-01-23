package FOR_LOOP_2.SERIES;

public class FOR_23
{
    void main()
    {
        int i=0;
        int n1=2;
        int n2=3;
        int n3=4;
        int d=2;
        
        for(i=1;i<=10;i++)
        {
            
            System.out.println(n1+"*"+n2+"*"+n3+"/"+d);
            n1=n1+1;
            n2=n2+1;
            n3=n3+1;
            d=d+1;
        }
    }
}