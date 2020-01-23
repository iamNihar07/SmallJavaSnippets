import java.util.*;
public class Q3
{
    static Scanner sc=new Scanner(System.in);
    String s;

    Q3()
    {
        s="";        
    }

    void input()
    {
        Scanner sc1=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a sentence less than 100 letters.");
            s=sc1.nextLine();
            if(s.length()<100)
            {
                break;
            }
            else
            {
                System.out.println("Invalid input");
            }
        }        
        s=s.trim()+" ";
    }

    void choice()
    {        
        while(true)
        {
            System.out.println();
            System.out.println("1.Piglatin encoding");
            System.out.println("2.Reverse encoding");
            System.out.println("Enter your choice.");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                piglatin();
                break;

                case 2:
                reverse();
                break;

                default:
                System.out.println("Invalid input");
            }
            if(ch==1 || ch==2)
            {
                break;
            }
        }
    }

    void piglatin()
    {
        String s1="",s2="",s3="",s4="",A="",w="",a="";
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
                flag=false;
                for(int j=0;j<a.length();j++)
                {
                    A=a.toUpperCase();
                    char ch1=A.charAt(j);
                    if(ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U')
                    {
                        s1=a.substring(j+1);
                        s2=a.substring(0,j+1);
                        s3=s1+s2;
                        flag=true;
                        break;
                    }
                }

                if(flag==false)
                {
                    s4="a"+a;
                }
                else
                {
                    s4="a"+s3;
                }
                System.out.println(s4);
            }
        }
    }

    void reverse()
    {
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;;
            }
            else
            {
                System.out.println(w);
                w="";
            }
        }
    }

    public static void main()
    {
        int n=0;
        do
        {
            Q3 ob=new Q3();
            ob.input();
            ob.choice();
            System.out.println("Do you wish to continue?");
            System.out.println("1=Yes/ Any other no. =No");
            n=sc.nextInt();
            System.out.print("\u000c");
        }while(n==1);
    }
}

