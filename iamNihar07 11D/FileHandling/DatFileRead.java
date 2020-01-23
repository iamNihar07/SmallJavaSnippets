package FileHandling;
import java.io.*;
public class DatFileRead
{
    public static void main()throws IOException
    {
        boolean EOF=false;
        try
        {
            int rno;
            float marks;
            String name;
            FileInputStream fi=new FileInputStream("11d.dat");
            DataInputStream di=new DataInputStream(fi);

            while(!EOF)
            {
                try
                {
                    rno=di.readInt();
                    System.out.println("Roll. no : "+rno);
                    name=di.readUTF();
                    System.out.println("Name : "+name);
                    marks=di.readFloat();
                    System.out.println("Marks : "+marks);
                }
                catch(EOFException e)
                {
                    System.out.println("End of file.");
                    EOF=true;
                }
            }
            di.close();
            fi.close();
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("File not found.");
        }
    }
}

        
                    