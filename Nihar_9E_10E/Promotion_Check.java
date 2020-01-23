

public class Promotion_Check
{
   void main( int a,int b,int c,int d,int e)
   { int s=(a+b+c+d+e);
     float avg=s/5;
     System.out.println("The total marks are "+s);
     System.out.println("The average is "+avg);
     if(avg>40)
     {System.out.println("Promotion accepted!");}
     else if(avg<40)
     {System.out.println("Promotion denied!");}
    }
}