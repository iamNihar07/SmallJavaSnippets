package FileHandling;

import java.io.*;
public class Interest
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String name;
        FileWriter fw=new FileWriter("Interest.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);

        System.out.println("Enter the number of customers.");
        int i=Integer.parseInt(in.readLine());
        pw.println("Name \t Age \t Term \t Amount");
        for(int j=1;j<=i;j++)
        {

            System.out.println("Enter the name.");
            name=in.readLine();
            System.out.println("Enter age.");
            int age=Integer.parseInt(in.readLine());
            System.out.println("Enter the term deposit amt.");
            float d=Float.parseFloat(in.readLine());        
            System.out.println("Enter the term.");
            int n=Integer.parseInt(in.readLine());
            double amt=0;

            if(age>=1 && age<=60)
            {
                if(n==1)
                {
                    amt=d+0.075d;
                }
                else if(n==2)
                {
                    amt=d+0.085d;
                }
                else if(n==3)
                {
                    amt=d+0.095d;
                }
                else if(n>3)
                {
                    amt=d+0.1d;
                }
            }
            else if(age>60)
            {
                if(n==1)
                {
                    amt=d+0.08d;
                }
                else if(n==2)
                {
                    amt=d+0.09d;
                }
                else if(n==3)
                {
                    amt=d+0.1d;
                }
                else if(n>3)
                {
                    amt=d+0.11d;
                }
            }
            System.out.println("Interest earned= "+(amt-d));
            System.out.println("Amount= "+amt);

            pw.println(name+"\t"+age+"\t"+n+"\t"+amt);
        }
        pw.close();
        bw.close();
        fw.close();
        System.out.println("Data written to the file...");
    }
} 
