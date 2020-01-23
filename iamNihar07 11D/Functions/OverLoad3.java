package Functions;
public class OverLoad3
{
    void check(int x)
    {
        boolean flag=true;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true & x!=1)
        {
            System.out.println("Prime no");
        }
        else
        {
            System.out.println("Not prime.");
        }  
    }

    void check(String x)
    {
        boolean flag=true;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(Character.isUpperCase(ch))
            {
                flag=false;
            }
            else
            {
                flag=true;
                break;
            }
        }
        if(flag==false)

        {
            System.out.println("Upper Case.");
        }
        else
        {
            boolean flag2=true;
            for(int i=0;i<x.length();i++)
            {
                char ch=x.charAt(i);
                if(Character.isLowerCase(ch))
                {
                    flag=false;
                }
                else
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)

            {
                System.out.println("Lower Case.");
            }
            else
            {
                System.out.println("mixed Case.");
            }
        }
    }

    void check(char ch)
    {
        if(Character.isLetter(ch))
        {
            System.out.println("Letter.");
        }
        else if(Character.isDigit(ch))
        {
            System.out.println("Digit.");
        }
        else if(ch==' ')
        {
            System.out.println("Space.");
        }
        else
        {
            System.out.println("Special char.");
        }
    }

    void main()
    {
        check(59);
        check("nihaR");
        check('9');
    }
}