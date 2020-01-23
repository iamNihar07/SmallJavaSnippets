
public class IMPORTANT
{
    static void main() //interchanging first and last letter of the word. ADD SPACE
    {
        String x="Nihar Gupte ";

        String w="",a="",s="",w1="";
        char c;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }

            else
            {
                a=w;
                w="";
                w1="";
                char ch1=a.charAt(0);
                char ch2=a.charAt(a.length()-1);
                for(int j=0;j<a.length();j++)
                {

                    c=a.charAt(j);
                    if(j==0)
                    {
                        c=ch2;
                    }
                    if(j==a.length()-1)
                    {
                        c=ch1;
                    }
                    w1=w1+c;;
                }

                s=s+" "+w1;

            }
        }
        System.out.println(s);

    }
}
