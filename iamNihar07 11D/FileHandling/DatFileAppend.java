package FileHandling;
import java.io.*;
public class DatFileAppend
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String name;

        int rno;
        float marks;
        String res;

        FileOutputStream fw=new FileOutputStream("11d.dat",true);
        DataOutputStream dw=new DataOutputStream(fw);
        System.out.println("Appending records in an existing file");

        do
        {
            System.out.println("Enter roll no.");
            rno=Integer.parseInt(in.readLine());
            System.out.println("Enter name.");
            name=in.readLine();
            System.out.println("Enter marks.");
            marks=Float.parseFloat(in.readLine());
            dw.writeInt(rno);
            dw.writeUTF(name);
            dw.writeFloat(marks);
            System.out.println("Any more records? yes or no");
            res=in.readLine();
        }while(res.equalsIgnoreCase("yes"));
        dw.close();
        fw.close();
        System.out.println("Data written to the file...");

    }
}

