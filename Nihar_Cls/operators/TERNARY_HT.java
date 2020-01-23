package operators;

public class TERNARY_HT
{
    void main(double a,double b, double c)
    {
        double t=a>b?b>c?b:c:a>c?a:c;
        System.out.println("TALLEST = "+t);
    }
}
