package PracticalQs;
import java.io.*;
/**
 * 
 */
public class PracticalQ1
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int m=0;
        do
        {
            System.out.println("Enter m");
            m=Integer.parseInt(in.readLine());
            if(m>2 && m<20)
            {
                break;
            }
            else
            {
                System.out.println("M should be greater than 2,less than 20");
            }
        }while(true);

        int a[][]=new int[m][m];

        System.out.println("Enter elements of A");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                do
                {
                    try
                    {
                        a[i][j]=Integer.parseInt(in.readLine());
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.println("Plz enter integer values only");
                    }
                }while(true);
            }
        }

        System.out.println("The original matrix is :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        int b[][]=new int[m][m];
        int k=m-1;
        for(int i=0;i<m;i++)
        {            
            for(int j=0;j<m;j++)
            {
                b[j][i]=a[j][k];                
            }
            k--;
        }

        System.out.println("The mirrored array is:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
        boolean flag=true; int d=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                int n=b[i][j];
                flag=true;
                for(int l=2;l<n;l++)
                {
                    if(n%l==0)
                    {
                        flag=false;
                        break;
                    }                    
                }
                if(flag==true && n!=1)
                {
                    d++;
                }
            }
        }
        boolean flag2=true;
        int pno[]=new int[d];
        int row[]=new int[d];
        int column[]=new int[d];
        int s=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                int n=b[i][j];
                flag2=true;
                for(int l=2;l<n;l++)
                {
                    if(n%l==0)
                    {
                        flag2=false;
                        break;
                    }                    
                }
                if(flag2==true && n!=1)
                {
                    pno[s]=n;
                    row[s]=i;
                    column[s]=j;                    
                    s++;
                }
            }
        }
        
        int temp=0;
        for(int i=0;i<pno.length;i++)
        {
            for(int j=i+1;j<pno.length;j++)
            {
                if(pno[i]>pno[j])
                {
                    temp=pno[i];
                    pno[i]=pno[j];
                    pno[j]=temp;

                    temp=row[i];
                    row[i]=row[j];
                    row[j]=temp;

                    temp=column[i];
                    column[i]=column[j];
                    column[j]=temp;
                }
            }
        }        

        System.out.println("Prime no \t Row \t Column");
        for(int i=0;i<d;i++)
        {              
            System.out.println(pno[i]+"\t"+row[i]+"\t"+column[i]);
        }
    }
}
