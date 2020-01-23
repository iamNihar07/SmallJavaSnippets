package Arrays;

public class Merging
{
    static void Merge1() //1,10,2,20,3,30/////
    {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[]={10,20,30,40,50,60,70,80,90,100};
        int la=A.length;
        int lb=B.length;
        int lc=la+lb;
        int R[]=new int[lc];
        int n=0;

        for(int i=0;i<lc;i+=2)
        {
            R[i]=A[n];
            R[i+1]=B[n];
            n++;
        }

        for(int i=0;i<lc;i++)
        {
            System.out.println(R[i]);
        }
    }

    static void Merge2() //1,2,3,4,5,6,7,8,10,10,20,30...
    {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int B[]={10,20,30,40,50,60,70,80,90,100};
        int la=A.length;
        int lb=B.length;
        int lc=la+lb;
        int R[]=new int[lc];
        int n=0;

        for(int i=0;i<la;i++)
        {
            R[i]=A[i];        
        }

        for(int i=0;i<lb;i++)
        {
            R[i+la]=B[n];
            n++;
        }

        for(int i=0;i<lc;i++)
        {
            System.out.println(R[i]);
        }

    }

    static void Merge3()
    {
        int A[]={1,2,3,4,5,6};
        int B[]={10,20,30,40,50,60,70,80,90,100};
        int la=A.length;
        int lb=B.length;
        int lc=la+lb;
        int R[]=new int[lc];
        int np=Math.min(la,lb);
        int n=0;

        for(int i=0;i<lc;i+=2)
        {
            if(i<(np*2))
            {
                R[i]=A[n];
                R[i+1]=B[n];
                n++;
            }
            else
            {
                if(la>lb)
                {
                    R[i]=A[n];
                    n++;
                    i--;
                }
                else
                {
                    R[i]=B[n];
                    n++;
                    i--;
                }
            }
        }

        for(int i=0;i<lc;i++)
        {
            System.out.println(R[i]);
        }

    }
}
