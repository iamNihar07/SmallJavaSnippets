package BasicPrograms;

/**
 * a shop keeper offers 10% disc on the PP of a digital camera.
 * However the customer has to pay 6% sales tax on the remaining amt.
   WAP to calc the amt to be paid by the customer*/
public class Shopkeeper
{
    static void main(double pp)
    {
        double disc=0.1*pp;
        double sp=pp-disc;
        double tax=0.06*sp;
        double amt=sp+tax;
        
        System.out.println("The Printed price is "+pp);
        System.out.println("The Discount is "+disc);
        System.out.println("The Selling Price is "+sp);
        System.out.println("The tax is "+tax);
        System.out.println("The amount to be paid is "+amt);
    }
}
        
    