
/**
 * Write a description of class l here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class l
{
    static void main()
    {
        int a,sum,b;
        a=sum=0;
        b=1;
        System.out.println(a+","+b+",");
        sum=a+b;
        System.out.println(sum+",");
        while(sum<0)
        {
            a=b;
            b=sum;
            sum=a+b;
            System.out.println(sum+"\t");
        }
    }

}

