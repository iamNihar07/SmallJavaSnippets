import java.util.*;
public class RecurseNatural
{
    void display(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            display(n-1);
        }
    }
    //OR
    void display2(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(n);        
        display(n-1);
    }
    
    static void main()
    {
        RecurseNatural ob=new RecurseNatural();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int no=sc.nextInt();
        System.out.println("Displaying");
        ob.display(no);
        System.out.println();
        ob.display2(no);
    }
}
    