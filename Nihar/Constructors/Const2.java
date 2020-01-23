package Constructors;
public class Const2
{
    int a,b,sum;
    
    Const2(int a,int b)
    {                
        this.a = a;
        this. b = b;
    }
    
    
        public void display()
    {
         sum = a + b;
         System.out.println(this);
         System.out.println("Sum of the 2 numbers = "+sum);
    } 
    
}
