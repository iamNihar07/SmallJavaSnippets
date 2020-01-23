
public class stack
{
    int stackarr[]=new int[5];
    int ctr,top;
    void push(int value)
    {
        int temp=ctr;
        if(ctr<5)
        {
            if(ctr==top) //when stack is empty
            {
                stackarr[top]=value;
            }
            else //when stack is partially filled
            {
                while(ctr!=top)
                {
                    stackarr[ctr]=stackarr[ctr-1];
                    ctr--;
                }
                stackarr[top]=value;
            }
            ctr=temp+1;
        }
        else
        {
            System.out.println("Stack overflow");
        }
    }

    void pop()
    {
        if(ctr==0)
        {
            System.out.println("Stack underflow");
        }
        else
        {
            for(int i=0;i<ctr-1;i++)
            {
                stackarr[i]=stackarr[i+1];
            }
            ctr--;
        }
    }

    void display()
    {
        System.out.println("\nStack Currently");
        for(int i=0;i<ctr;i++)
        {
            System.out.println("\t"+stackarr[i]+"\n");
        }
    }
}