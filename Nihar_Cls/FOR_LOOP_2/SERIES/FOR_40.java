package FOR_LOOP_2.SERIES;


public class FOR_40
{
    void main()
    {
        double p=0.0,s=0.0;
        
        for(int i=1;i<=8;i++)
        {
            p=p*10+3;
            s=Math.pow(10,i);
            s=p/s;
            System.out.println(s);
        }
    }

}
