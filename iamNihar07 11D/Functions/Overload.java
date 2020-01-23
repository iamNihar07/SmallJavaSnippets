package Functions;
public class Overload
{
    void sum(int a,int b)
    {
        System.out.println("Sum is "+(a+b));
    }

    void sum(String s1,String s2)
    {
        System.out.println(s1.concat(s2));
    }

    void sum(char c1,char c2)
    {
        System.out.println("Sum of ASCII "+(c1+c2));
    }

    void main()
    {
        sum(5,6);
        sum("Done By a Great"," Programmer");
        sum('N','G');
    }
}


        