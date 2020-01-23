package Functions;

public class OverLoad
{
    void reverse(String r)
    {
        String w="";
        for(int i=0;i<r.length();i++)
        {
            char ch=r.charAt(i);
            w=ch+w;
        }
        System.out.println("Reverse of "+r+" is "+w);
    }
    void reverse(int r)
    {
        int m=r,a=0,nn=0;
        while(m!=0)
        {
            a=m%10;
            nn=nn*10+a;
            m=m/10;
        }
        System.out.println("Reverse of "+r+" is "+nn);
    }
    static void main()
    {
        OverLoad ob=new OverLoad();
        ob.reverse("ABC");
        ob.reverse(7571);
    }
}
        
        
   