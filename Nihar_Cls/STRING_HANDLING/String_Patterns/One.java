package STRING_HANDLING.String_Patterns;


public class One
{
    static void main()
    {
        String s="India";
        int i=0;
        int l = s.length();
        
        for(i=l;i>=1;i--)
        {
            System.out.println(s.substring(0,i));
        }
    }
}

        