package BOOK_PG_NO_375;

public class Q_4
{
    void main ()
    {
        double p=10000;
        double r=15;
        double t=2;
        double ci=(p*Math.pow((1 +(r/100)),t));
        System.out.println("CI = "+ci+" & Amount = "+(p+ci)); 
    }
}
