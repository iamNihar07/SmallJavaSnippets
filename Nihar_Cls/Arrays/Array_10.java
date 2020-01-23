package Arrays;      
import java.io.*;    
public class Array_10
{                   
    static void main()throws IOException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String con[]= new String[5];
        System.out.println("Enter 5 values.");
        char ch; int c=0;
        for(int i=0;i<con.length;i++)
        {
            con[i]=in.readLine();
        }
        System.out.println("The pallindrome words of the array are ");
        for(int i=0;i<con.length;i++)
        {
            int l=con[i].length();
            String rw="";
            for(int j=0;j<l;j++)
            {
                ch=con[i].charAt(j);
                rw=ch+rw;
            }
            if(con[i].equalsIgnoreCase(rw))
            {
                System.out.println(con[i]);
                c++;
            }
        }
        System.out.println("No of pallindrome words "+c);
    }
}
                
            