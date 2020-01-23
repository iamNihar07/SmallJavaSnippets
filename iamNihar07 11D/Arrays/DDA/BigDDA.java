package Arrays.DDA;

import java.io.*;
public class BigDDA
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String student[]=new String[2];
        int marks[][]=new int[2][6];

        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the students name.");
            student[i]=in.readLine();

            System.out.println("Enter the marks in English Subject");
            marks[i][0]=Integer.parseInt(in.readLine());
            System.out.println("Enter the marks in Maths Subject");
            marks[i][1]=Integer.parseInt(in.readLine());
            System.out.println("Enter the marks in Phy Subject");
            marks[i][2]=Integer.parseInt(in.readLine());
            System.out.println("Enter the marks in Chem Subject");
            marks[i][3]=Integer.parseInt(in.readLine());
            System.out.println("Enter the marks in Comp Subject");
            marks[i][4]=Integer.parseInt(in.readLine());
        }

        for(int i=0;i<2;i++)
        {
            marks[i][5]=marks[i][0]+marks[i][1]+marks[i][2]+
            marks[i][3]+marks[i][4];
        }

        System.out.println("Student name \t English  \t Maths  \t Phy  \t Chem  \t Comp  \t Grand Total");
        for(int i=0;i<2;i++)
        { 
            System.out.println(student[i]+"\t\t"+marks[i][0]+"\t"+marks[i][1]+"\t"
            +marks[i][2]+"\t"+marks[i][3]+"\t"+marks[i][4]+"\t"+marks[i][5]);
        }
        
        //can perform linear search 
    }
}