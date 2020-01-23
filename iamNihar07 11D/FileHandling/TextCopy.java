package FileHandling;
import java.io.*;
public class TextCopy
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter the name of the source file.");
        String source=in.readLine()+".txt";
        System.out.println("Enter the name of the target file.");
        String target=in.readLine()+".txt";

        TextCopy ob=new TextCopy();
        ob.display(source);
        ob.copy(source,target);
        ob.display(target);
        System.out.println("File copied...");
    }

    void display(String sourcefile)throws IOException
    {
        FileReader fr=new FileReader(sourcefile);
        BufferedReader br=new BufferedReader(fr);
        String n="";
        System.out.println("The contents of the file are : ");
        while((n=br.readLine())!=null)
        {
            System.out.println(n);
        }
        br.close();
        fr.close();
    }

    void copy(String sourcefile, String targetfile)throws IOException
    {
        FileReader fr=new FileReader(sourcefile);
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter(targetfile);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        String n="";
        while((n=br.readLine())!=null)
        {
            pw.println(n);
        }
        System.out.println("Data successfully copied");
        pw.close();
        bw.close();
        fw.close();
        br.close();
        fr.close();
    }
}

    