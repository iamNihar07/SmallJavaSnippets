package Class_Progs;

import java.io.*;
public class Class_01
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String name;
    double eng,math,sci,lang2,comp,total,per;
    void accept()throws IOException
    {
        System.out.println("Enter name.");
        name=in.readLine();
        System.out.println("Enter english marks.");
        eng=Double.parseDouble(in.readLine());
        System.out.println("Enter maths marks.");
        math=Double.parseDouble(in.readLine());
        System.out.println("Enter sci marks.");
        sci=Double.parseDouble(in.readLine());
        System.out.println("Enter lang2 marks.");
        lang2=Double.parseDouble(in.readLine());
        System.out.println("Enter comp marks.");
        comp=Double.parseDouble(in.readLine());
    }

    void calculate()
    {
        total=eng+math+sci+lang2+comp;
        per=total/5;
    }

    void display()
    {
        System.out.println("Name - "+name);
        System.out.println("Eng- "+eng);
        System.out.println("Maths- "+math);
        System.out.println("sci- "+sci);
        System.out.println("lang2- "+lang2);
        System.out.println("comp- "+comp);
        System.out.println("total- "+total);
        System.out.println("percent- "+per+"%");
    }

    static void main()throws IOException
    {   

        Class_01 ob=new Class_01();
        ob.accept();
        ob.calculate();
        ob.display();

    }
}

    
