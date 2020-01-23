package For_Loop;
public class For_Loop7
{ void main()
    {   int i;
        double a=0;
        double s=0;

        for(i=1;i<=10;i++)
        {  a=(Math.pow(i,2)-1);
           s=s+a;
        }
        System.out.println(s);
    }
}