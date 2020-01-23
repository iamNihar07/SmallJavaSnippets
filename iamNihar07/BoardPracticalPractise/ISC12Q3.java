package BoardPracticalPractise;

import java.util.*;
public class ISC12Q3
{
    int m,n;
    int a[][];
    
    ISC12Q3(int m,int n)
    {
        this.m=m;
        this.n=n;
        a=new int[m][n];
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    void getMinMax()
    {
        int min=a[0][0];
        int max=a[0][0];
        int minr=0,minc=0,maxr=0,maxc=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                    maxr=i;
                    maxc=j;
                }
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    minr=i;
                    minc=j;
                }
            }
        }
        
        System.out.println();
        System.out.println("Largest number= "+max);
        System.out.println("Row= "+maxr);
        System.out.println("Column= "+maxc);
        System.out.println();
        System.out.println("Smallest number= "+min);
        System.out.println("Row= "+minr);
        System.out.println("Column= "+minc);
        System.out.println();
    }
    
    void arrange()
    {
        int temp[]=new int[m*n];
        int k=0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[k]=a[i][j];
                k++;
            }
        }
        
        int t=0,min=0;
        for(int i=0;i<temp.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[j]<temp[min])
                {
                    min=j;
                }
            }
            t=temp[min];
            temp[min]=temp[i];
            temp[i]=t;
        }
        
        k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=temp[k];
                k++;
            }
        }
    }
    
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        int m=0,n=0;
        do
        {
            while(true)
            {
                System.out.println("Enter m");
                m=sc.nextInt();
                System.out.println("Enter n");
                n=sc.nextInt();
                if(m>2 && n>2 && m<20 && n<20)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input");
                }
            }
            
            ISC12Q3 ob=new ISC12Q3(m,n);
            ob.input();
            System.out.println();
            System.out.println("Original Matrix:");
            ob.display();
            ob.getMinMax();    
            ob.arrange();
            System.out.println("Rearranged Matrix:");
            ob.display();
            System.out.println();
            
            System.out.println("Do you wish to continue the execution? ");
            System.out.println("1 for yes, any other no. for no");
            ch=sc.nextInt();
        }while(ch==1);
    }
}

            
               
        
        
    
        
        
        
        