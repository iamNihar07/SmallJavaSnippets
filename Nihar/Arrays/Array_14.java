package Arrays;
import java.io.*;
public class Array_14
{
    static void main() throws IOException //sorting name,roll number,address using selection sort
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        int rno[]=new int[5];  int temp =0,min=0; 
        String temp1="";
        String name[]=new String[5];
        String add[]=new String[5];
        for(int i=0;i<rno.length;i++)
        {
            System.out.println("Enter the name.");
            name[i]=in.readLine();
            System.out.println("Enter the roll number.");
            rno[i]=Integer.parseInt(in.readLine());            
            System.out.println("Enter the address");
            add[i]=in.readLine();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int j=0;

        for(int i=0;i<rno.length-1;i++)
        {
            min=i;
            for( j=i+1;j<rno.length;j++)
            {
                if(name[min].compareToIgnoreCase(name[j])>0)
                {
                    min=j;
                }
            }
            temp=rno[min];
            rno[min]=rno[i];
            rno[i]=temp;
            
            temp1=name[min];
            name[min]=name[i];
            name[i]=temp1;
            
            temp1=add[min];
            add[min]=add[i];
            add[i]=temp1;
        }
        System.out.println("R.No."+"\t"+"Name"+"\t"+"Address");
        for(int i=0;i<rno.length;i++)
        {            
            System.out.println(rno[i]+"\t"+name[i]+"\t"+add[i]);
        }
    }
}

        