
public class Fibonacci
{
    static void main()
    {
        int a=0; int b=1; int c=0;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=3;i<=10;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}


