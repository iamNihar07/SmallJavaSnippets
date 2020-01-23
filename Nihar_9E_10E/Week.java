
import java.io.*;
public class Week
{
    void main() throws IOException
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        int ch=Integer.parseInt(in.readLine());
        switch (ch)
        { 
            case 1:
            System.out.println("Its Sunday.");
            break;
            case 2:
            System.out.println("Its Monday.");
            break;
            case 3:
            System.out.println("Its Tuesday.");
            break;
            case 4:
            System.out.println("Its Wednesday.");
            break;
            case 5:
            System.out.println("Its Thursday.");
            break;
            case 6:
            System.out.println("Its Friday.");
            break;
            case 7:
            System.out.println("Its Saturday.");
            break;
            default: 
            System.out.println("WrONG CHOICE!!!");
        }
    }
}