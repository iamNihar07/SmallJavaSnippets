package If_Condition;

public class If_9
{
    void main(double m)
    {
        if(m>=0 && m<40)
        {
            System.out.println("You have failed");
        }
        else if(m>=40 && m<55)
        {
            System.out.println("You have attained pass class");
        }
        else if(m>=55 && m<60)
        {
            System.out.println("You have attained second class");
        }
        else if(m>=60 && m<75)
        {
            System.out.println("You have attained first class");
        }
        else if(m>=75 && m<=100)
        {
            System.out.println("You have attained distinction");
        }
        else
        {
            System.out.println("Marks entered are wrong");
        }
    }
}
