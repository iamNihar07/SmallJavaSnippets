public class sorts
{
    int m[]={4,7,3,9,5};

    void seqSort()
    {
        int temp=0;
        for(int i=0;i<m.length-1;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[j]<m[i])
                {
                    temp=m[j];
                    m[j]=m[i];
                    m[i]=temp;
                }
            }
        }
    }

    void selectionSort()
    {
        int temp=0;
        int min=0;
        for(int i=0;i<m.length-1;i++)
        {
            min=i;
            for(int j=i+1;j<m.length;j++)
            {
                if(m[j]<m[min])
                {
                    min=j;
                }

            }
            temp=m[min];
            m[min]=m[i];
            m[i]=temp;
        }
    }

    void bubbleSort()
    {
        int temp=0;
        for(int i=0;i<m.length-1;i++)
        {
            for(int j=0;j<m.length-i-1; j++)
            {
                if(m[j]>m[j+1])
                {
                    temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                }
            }
        }
    }

    void insertionSort()
    {
        int flag=0,j=0;        
        for(int i=1;i<m.length;i++)
        {
            flag=m[i];
            j=i-1;
            while(flag<m[j])
            {
                m[j+1]=m[j];
                j--;
                if(j<0)
                {
                    break;
                }
            }
            m[j+1]=flag;

        }
    }
    
    void binarySearch(int ns)
    {
        int lb=0,ub=m.length-1,p=0;
        boolean flag=false;
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(m[p]<ns)
            {
                lb=p+1;
            }
            else if(m[p]>ns)
            {
                ub=p-1;
            }
            else if(m[p]==ns)
            {
                flag=true;
                break;
            }
        }        
        System.out.println(flag);
    }

    void display()
    {
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }

    }

}
