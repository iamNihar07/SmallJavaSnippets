package Constructors;
import java.io.*;
public class LAPTOP
{
    String name;
    double price;
    double disc;
    double amt;
    
    LAPTOP()
    {
        name="";
        price=0.0;
        disc=0.0;
        amt=0.0;
    }
    
    void accept()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the name.");
        name=in.readLine();
        System.out.println("Enter the price.");
        price=Double.parseDouble(in.readLine());
    }
    
    void discount()
    {
        if(price<=25000)
        {
            disc=0.05;
            amt=price-(disc*price);
        }
        else if(price>25000 && price<=50000)
        {
            disc=0.075;
            amt=price-(disc*price);
        }
        else if(price>50000 && price<=100000)
        {
            disc=0.1;
            amt=price-(disc*price);
        }
        else if(price>100000)
        {
            disc=0.15;
            amt=price-(disc*price);
        }
        
    }
    void display()
    {
        System.out.println("Name- "+name);
        System.out.println("Discount- "+disc);
        System.out.println("Final Amount = "+amt);
    }
}
        
        
    