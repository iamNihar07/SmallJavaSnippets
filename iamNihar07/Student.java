import java.io.*;
public class Student
{
    int rno,p,c,m;
    String name;      

    void input() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter the name.");
        name=in.readLine();
        System.out.println("Enter roll no.");
        rno=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in phy.");
        p=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in chem.");
        c=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in maths.");
        m=Integer.parseInt(in.readLine());
    }
    
    int findTotal()
    {
        int grandtotal=p+c+m;
        return grandtotal;
    }
    
    double findPercent()
    {
        double percent=(p+c+m)*100/300.0;
        return percent;
    }
    
    String findResult()
    {
        String x="";
        if(findPercent()>=40)
        {
            x="Pass.";
        }
        else
        {
            x="Fail.";
        }
        return x;
    }
    
    char findGrade()
    {
        double n=findPercent();
        char ch=0;
        if(n>=80 && n<=100)
        {
            ch='A';
        }
        else if(n>=60 && n<80)
        {
            ch='B';
        }
        else if(n>=40 && n<60)
        {
            ch='C';
        }
        else if(n<40)
        {
            ch='D';
        }
        return ch;
    }
    
    void display() throws IOException
    {        
        System.out.println("Roll no : "+rno);
        System.out.println("Name: "+name);
        System.out.println("Marks in Phy: "+p);
        System.out.println("Marks in Chem: "+c);
        System.out.println("Marks in Maths: "+m);
        System.out.println("Grand total: "+(findTotal()));
        System.out.println("Percentage: "+(findPercent()));
        System.out.println("Grade: "+(findGrade()));
        System.out.println("Remark: "+(findResult()));
    }
    
    void main()throws IOException
    {
        Student s1=new Student();
        Student s2=new Student();
        
        s1.input();
        s1.display();
        System.out.println();
        s2.input();
        s2.display();
    }
}
    
        

    