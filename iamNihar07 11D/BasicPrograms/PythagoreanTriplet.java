package BasicPrograms;

/**
 *check for pythagoren triplets.
 */
public class PythagoreanTriplet
{
    static void main(int a, int b, int c)
    {
        if(((a*a)+(b*b)==(c*c)) || ((a*a)+(c*c)==(b*b)) || ((b*b)+(c*c)==(a*a)))
        {
            System.out.println("Pythagorean Triplet.");
        }
        else
        {
            System.out.println("Not a pythagoream triplet.");
        }
    }
}