package STRING_HANDLING.String_Patterns;


public class Two
{
    static void main()
    {
        String s="India";
        int i=0;
        int l = s.length();
        
        for(i=1;i<=l;i++)
        {
            System.out.println(s.substring(0,i));
        }
    }
}

        