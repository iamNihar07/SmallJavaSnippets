package Functions;
public class OverLoad4
{
    void perform(String s)
    {
        int shift=2;        
        String code="";
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                x=ch+shift;
                if(x>90)
                {
                    x=65+(x-91);
                }
                code=code+(char)x;
            }

            else
            {
                code=code+ch;
            }
        }
        System.out.println("The Incryptred String is "+code);
    }

    void perform(int x)
    {
        int m=x,a=0,nn=0;

        while(m!=0)
        {
            a=m%10;
            nn=nn*10+a;
            m=m/10;
        }

        System.out.println(nn);
    }

    void main()
    {
        perform("ABCD");
        perform(123);
    }
}