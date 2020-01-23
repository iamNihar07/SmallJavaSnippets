
public class CircularCoding
{
    static void main()
    {
        String s="abz";
        
        int shift=1,nn=0;
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            nn=ch+shift;
            
            if((nn>=65 && nn<=90) || (nn>=97 && nn<=122))
            {
                s2=s2+(char)nn;
            }
            else
            {
                s2=s2+(char)(nn-26);
            }
            
        }
        System.out.println(s2);

    }
}