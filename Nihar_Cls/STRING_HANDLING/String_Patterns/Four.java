package STRING_HANDLING.String_Patterns;


public class Four
{
    static void main()
    {
        String s="India";
        int i=0;
        int l = s.length();
        
        for(i=l-1;i>=0;i--)
        {
            System.out.println(s.substring(i));
        }
    }
}

        