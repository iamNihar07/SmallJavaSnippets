package FileHandling;

import java.io.*;
public class Vote
{
    public static void main()throws IOException
    {
        try
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);

            int UID; 
            String reg;
            String name;
            int i;
            DataInputStream ds=new DataInputStream(System.in);
            FileOutputStream fw=new FileOutputStream("voter.dat");
            DataOutputStream dw=new DataOutputStream(fw);        

            System.out.println("Enter the no of voters.");
            int n=Integer.parseInt(in.readLine());
            
            for(i=1;i<=n;i++)
            {
                System.out.println("Enter UID");
                UID=Integer.parseInt(in.readLine());
                System.out.println("Enter name.");
                name=in.readLine();
                System.out.println("Enter region.");
                reg=in.readLine();
                dw.writeInt(UID);
                dw.writeUTF(name);
                dw.writeUTF(reg);
            }
            dw.close();
            fw.close();
            System.out.println("Data written to the file...");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
