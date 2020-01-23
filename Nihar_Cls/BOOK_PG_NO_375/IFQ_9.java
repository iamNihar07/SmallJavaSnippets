package BOOK_PG_NO_375;

public class IFQ_9
{
    void main (double l, double b,double r, double h)
    {
        double vr = l*b*h;
        double vcy = 3.14*r*r*h;
        double vco = (1/3.0)*3.14*r*r*h;
        System.out.println("AREA OF CUBOID = "+vr+", AREA OF CYLINDER = "+vcy+"AREA OF CONE = "+vco);
    }
}
