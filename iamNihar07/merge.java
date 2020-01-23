
public class merge
{
    int a[]={1,2,3,4,5,8,9,10};
    int b[]={10,20,30,40,50,60,70};

    void merge1() //alternate
    {

        int la=a.length,lb=b.length;
        int np=Math.min(la,lb);
        int lc=la+lb;
        int c[]=new int[lc];
        int n=0;
        for(int i=0;i<lc;i+=2)
        {
            if(i<(np*2))
            {
                c[i]=a[n];
                c[i+1]=b[n];
                n++;
            }
            else
            {
                if(la>lb)
                {
                    c[i]=a[n];
                    n++;
                    i--;
                }
                else if(lb>la)
                {
                    c[i]=b[n];
                    n++;
                    i--;
                }
            }
        }

        display(c);
    }

    void merge2() //one by one
    {
        int la=a.length,lb=b.length;        
        int lc=la+lb;
        int c[]=new int[lc];
        
        for(int i=0;i<la;i++)
        {
            c[i]=a[i];
        }
        int n=0;
        for(int i=la;i<lc;i++)
        {
            c[i]=b[n];
            n++;
        }


        display(c);
    }

    void display(int m[])
    {
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
}

            