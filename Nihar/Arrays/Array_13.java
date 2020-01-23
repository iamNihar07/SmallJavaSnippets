package Arrays;
import java.io.*;
public class Array_13
{
    static void main() throws IOException //sorting roll number,name,address using bubble sort
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int rno[]=new int[5];  int temp =0,min=0; 
        String temp1="";
        String name[]=new String[5];
        String add[]=new String[5];
        for(int i=0;i<rno.length;i++)
        {
            System.out.println("Enter the roll number.");
            rno[i]=Integer.parseInt(in.readLine());
            System.out.println("Enter the name.");
            name[i]=in.readLine();
            System.out.println("Enter the address");
            add[i]=in.readLine();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=0;i<rno.length-1;i++)
        {
            for(int j=0;j<(rno.length-1-i);j++)
            {
                if(rno[j]>rno[j+1])
                {
                    temp=rno[j];
                    rno[j]=rno[j+1];
                    rno[j+1]=temp;
                    temp1=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp1;
                    temp1=add[j];
                    add[j]=add[j+1];
                    add[j+1]=temp1;
                }
            }
        }
        System.out.println("R.No."+"\t"+"Name"+"\t"+"Address");
        for(int i=0;i<rno.length;i++)
        {            
            System.out.println(rno[i]+"\t"+name[i]+"\t"+add[i]);
        }
    }
}

        