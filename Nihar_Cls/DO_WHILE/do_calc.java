package DO_WHILE;


import java.io.*;
public class do_calc
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        int a=0;
        int b=0;
        int ch;
        
        System.out.println("what is......");
        System.out.println("why is....");
        
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.multiply");
        System.out.println("4.div");
        
        System.out.println("enter the first no.");
        a=Integer.parseInt(in.readLine());
        System.out.println("enter the second no.");
        b=Integer.parseInt(in.readLine());
        
        System.out.println("enter the choice number");
        ch=Integer.parseInt(in.readLine());
        
        switch(ch)
        {
            case 1:
            System.out.println(a+b);
            break;
            
            case 2:
            System.out.println(a-b);
            break;
            
            case 3:
            System.out.println(a*b);
            break;
            
            case 4:
            System.out.println(a/b);
            break;
            
            default:
            System.out.println("wrong choice");
        }
    }
}
