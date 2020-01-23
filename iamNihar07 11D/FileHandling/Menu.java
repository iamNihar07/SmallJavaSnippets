package FileHandling;

import java.io.*;
public class Menu
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        FileOutputStream fon=new FileOutputStream("nonveg.dat");
        DataOutputStream don=new DataOutputStream(fon);
        FileOutputStream fov=new FileOutputStream("veg.dat");
        DataOutputStream dov=new DataOutputStream(fov);

        boolean EOF=false;

        String name="";
        float cost=0.0f;
        String catg="";
        try
        {
            FileInputStream fi=new FileInputStream("menu.dat");
            DataInputStream di=new DataInputStream(fi);

            try
            {
                while(!EOF)
                {
                    name=di.readUTF();
                    cost=di.readFloat();
                    catg=di.readUTF();
                    if(catg.equalsIgnoreCase("veg"))
                    {
                        dov.writeUTF(name);
                        dov.writeFloat(cost);
                    }
                    else if(catg.equalsIgnoreCase("nonveg"))
                    {
                        don.writeUTF(name);
                        don.writeFloat(cost);
                    }
                }
            }
            catch(EOFException e)
            {
                System.out.println("End of file.");
                EOF=true;
            }
            di.close();
            fi.close();
            
        }
       catch(FileNotFoundException e2)
       {
           System.err.println(e2);
        }
        dov.close();
        don.close();
        
    }
}
        
        
