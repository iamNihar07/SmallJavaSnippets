package Board;
import java.io.*;
public class movieMagic
{
    int year;
    float rating;
    String title;
    
    movieMagic()
    {
        year=0;
        rating=0.0f;
        title="";
    }
    
    void accept() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter the year");
        year=Integer.parseInt(in.readLine());
        System.out.println("Enter the title");
        title=in.readLine();
        while(true)
        {
            System.out.println("Enter the rating. Min rating=0.0 & max rating =5.0");
            rating=Float.parseFloat(in.readLine());
            if(rating>=0&&rating<=5)
            {
                break;
            }
            else
            {
                System.out.println("Please enter the rating in the range.");
            }
        }
    }
    
    void display()
    {
        System.out.println("The title is "+title);
        if(rating>=0.0&&rating<=2.0)
        {
            System.out.println("Flop");
        }
        else if(rating>=2.1&&rating<=3.4)
        {
            System.out.println("Semi hit");
        }
        else if(rating>=3.5&&rating<=4.5)
        {
            System.out.println("Hit");
        }
         else if(rating>=4.6&&rating<=5.0)
        {
            System.out.println("Super hit");
        }
    }
    
    static void main() throws IOException
    {
        movieMagic ob=new movieMagic();
        ob.accept();
        ob.display();
    }
}
        
        