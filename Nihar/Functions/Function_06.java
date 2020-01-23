package Functions;

public class Function_06
{
    static void main() //pass by reference
    {
        Function_06 ob= new Function_06();
        int n[]={1,2,3,4,5};
        ob.change(n);
        System.out.println();
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
    
    void change(int z[])
    {
        for(int i=0;i<z.length;i++)
        {
            z[i]=z[i]+5;
        }
        for(int i=0;i<z.length;i++)
        {
            System.out.println(z[i]);
        }
    }
}
        
    
    