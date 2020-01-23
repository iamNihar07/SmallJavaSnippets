package CALCULATION_PROGRAMS;


public class MKS
{
    void main(double m)
    {
        if(m>=0 && m<40)
        {
            System.out.println("FAIL");
        }
        else if(m>39 && m<55)
        {
            System.out.println("PASS CLASS");
        }
        else if(m>54 && m<60)
        {
            System.out.println("SECOND CLASS");
        }
        else if(m>64 && m<75)
        {
            System.out.println("FIRST CLASS");
        }
        else if(m>74 && m<=100)
        {
            System.out.println("DISTINCTION");
        }
        else
        {
            System.out.println("Wrong marks");
        }

    }
}
