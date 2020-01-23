package FileHandling;
import java.io.*;
public class Voter
{
    public static void main()throws IOException
    {
        boolean EOF=false;
        int k=0;
        try
        {
            int UID;
            String reg;
            String name;            
            FileInputStream fi=new FileInputStream("voter.dat");
            DataInputStream di=new DataInputStream(fi);

            while(!EOF)
            {
                try
                {
                    UID=di.readInt();
                    System.out.println("UID : "+UID);
                    name=di.readUTF();
                    System.out.println("Name : "+name);
                    reg=di.readUTF();
                    System.out.println("Region : "+reg);
                    k++;
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
        
        System.out.println("Total number of voters= "+k);
    }
}

        
                    