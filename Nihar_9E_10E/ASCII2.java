import java.util.Scanner;
public class ASCII2
{
    static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String x=sc.nextLine();
        int s=0;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            s=s+ch;
        }
        
        System.out.println(s);
    }
}
        