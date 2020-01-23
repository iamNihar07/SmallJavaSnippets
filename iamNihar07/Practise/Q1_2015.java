package Practise;

/**
Question 1.
Given two positive numbers M and N, such that M is between 100 and 10000 and N is
less than 100. Find the smallest integer that is greater than M and whose digits add up to
N. For example, if M=100 and N=11, then the smallest integer greater than 100 whose
digits add up to 11 is 119.
Write a program to accept the numbers M and N from the user and print the smallest
required number whose sum of all its digits is equal to N. Also, print the total number of
digits present in the required number. The program should check for the validity of the
inputs and display an appropriate message for an invalid input.
Test your program with some sample data and some random data:
Example 1:
INPUT : M= 100
N=11
OUTPUT:
The required number is= 119
Total number of digits=3
Example 2
INPUT: M= 1500
N=25
OUTPUT:
The required number is =1699
Total number of digits=4
Example 3
INPUT: M= 99
N=11
OUTPUT:
INVALID INPUT
Example 4
INPUT: M= 112 
2
N=130
OUTPUT:
INVALID INPUT
 */

import java.util.*;
public class Q1_2015
{
    int m,n;
    Q1_2015(int m,int n)
    {
        this.m=m ;
        this.n= n;
    }

    int findSmallest()
    {       
        int i=m;
        for(i=m;;i++)
        {
            if(sumOfDg(i)==n)
            {
                break;
            }
        }
        return i;
    }

    int sumOfDg(int t)
    {
        int a=0,s=0;
        while(t!=0)
        {
            a=t%10;
            s=s+a;
            t=t/10;
        }
        return s;
    }
    
    int ndg(int x)
    {
        int k=0;
        while(x!=0)
        {
            k++;
            x=x/10;
        }
        return k;
    }

    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int ch=0;
        int M=0,N=0;
        do
        {
            System.out.print("\u000c");

            while(true)
            {
                System.out.println("Enter M");
                M=sc.nextInt();
                if(M>=100 && M<10000)
                {
                    break;
                }
                else
                {
                    System.out.println("TRY AGAIN");
                }
            }
            while(true)
            {
                System.out.println("Enter N");
                N=sc.nextInt();
                if(N>0 && N<100)
                {
                    break;
                }
                else
                {
                    System.out.println("TRY AGAIN");
                }
            }    

            Q1_2015 ob=new Q1_2015(M,N);
            int x=ob.findSmallest();
            System.out.println("The required number is "+x);
            System.out.println("Number of digits= "+ob.ndg(x));
            System.out.println("Do you want to continue execution?");
            System.out.println("1= Yes/ Any other Number= No");
            ch=sc.nextInt();
        }while(ch==1);
    }
}


