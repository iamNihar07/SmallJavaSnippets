package Arrays;
import java.io.*;
public class Array_8
{                   
    static void main()throws IOException //Concatting two arrays
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]={1,2,3,4,5};
        int b[]={10,20,30,40,50,60,70};
        int n=0;
        int i=0;
        int la=a.length;
        int lb=b.length;
        int lc=la+lb;
        int c[]=new int[lc];
        int np=Math.min(la,lb);

        for(i=0;i<lc;i+=2)
        {
            if(i<(np*2))
            {

                c[i]=a[n];
                c[i+1]=b[n];
                n++;
            }
            else
            {
                if(lb>la)
                {
                    c[i]=b[n];
                    n++;
                    i--;
                }
                else

                {
                    c[i]=a[n];
                    n++;
                    i--;
                }
            }
        }

        System.out.println("The elements of Array C :");
        for(i=0;i<lc;i++)
        {
            System.out.println(c[i]);
        }
    }
}


