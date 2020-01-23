
public class Salary
{
    void main(double s)
    {double da=(18/100.00)*s;
     double hra=(14/100.00)*s;
     double pf=(8.33/100.00)*s;
     double gs=(s+da+hra);
     double ns=(gs-pf);
     System.out.println("The basic salary = "+s);
     System.out.println("The DA = "+da);
     System.out.println("The HRA = "+hra);
     System.out.println("The PF = "+pf);
     System.out.println("The Gross Sale = "+gs);
     System.out.println("The Net Sale = "+ns);
    }
}