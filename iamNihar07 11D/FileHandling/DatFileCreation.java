package FileHandling;

import java.io.*;
public class DatFileCreation
{
    public static void main()throws IOException
    {

        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int rno; 
        float marks;
        String name;
        int i;
        DataInputStream ds=new DataInputStream(System.in);
        FileOutputStream fw=new FileOutputStream("11d.dat");
        DataOutputStream dw=new DataOutputStream(fw);        

        for(i=1;i<=3;i++)
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
        }
        dw.close();
        fw.close();
        System.out.println("Data written to the file...");

    }
}
