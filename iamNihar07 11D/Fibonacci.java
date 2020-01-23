
public class Fibonacci
{
    static void main()
    {
        int a=0;
        int b=1;
        int s=1;
        System.out.print(a+" ,");
        System.out.print(b+" ,");
        for(int i=3;i<=10;i++)
        {
            int c=a+b;
            System.out.print(c+" ,");
            s=s+c;
            a=b;
            b=c;            
        }
        System.out.println();
        System.out.println("Sum is "+s);
    }
}