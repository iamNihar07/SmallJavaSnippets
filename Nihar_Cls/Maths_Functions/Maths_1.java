package Maths_Functions;

public class Maths_1
{
    void main(double a,double b)
    {
        //Start your program.
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(a));
        
        
        System.out.println("Minimum of 3 & 2 = "+Math.min(3,2));
        System.out.println("Minimum of 3 & 2.5 = "+Math.min(3,2.5));
        System.out.println("Minimum of 6.5 & 5 = "+Math.min(6.5,5));  
        System.out.println("Minimum of 5 & 6.5 = "+Math.min(5,6.5));   
        
        
        System.out.println("Maximum of 3 & 2 = "+Math.max(3,2));
        System.out.println("Maximum of 3 & 2.5 = "+Math.max(3,2.5));
        System.out.println("Maximum of 6.5 & 5 = "+Math.max(6.5,5.0));  
        System.out.println("Maximum of 5.0 & 6 = "+Math.max(5.0,6));   
        
        
        System.out.println("Absolute value of -6 = "+Math.abs(-6));
        System.out.println("Absolute value of 6 is "+Math.abs(+6));
        System.out.println("Absolute value of 6 is "+Math.abs(6));
        System.out.println("Absolute value of -6.5 = "+Math.abs(-6.5));
        System.out.println("Absolute value of 6.5 = "+Math.abs(6.5));
        System.out.println(6);
        
        
        System.out.println("Rounded value of 6.9 = "+Math.round(6.9));
        System.out.println("Rounded value of 6.5 = "+Math.round(6.5));
        System.out.println("Rounded value of 6.4 = "+Math.round(6.4));
        
        
        System.out.println("Rint value of 6.9 = "+Math.rint(6.9));
        System.out.println("Rint value of 6.5 = "+Math.rint(6.5));
        System.out.println("Rint value of 7.5 = "+Math.rint(7.5));
        System.out.println("Rint value of 6.4 = "+Math.rint(6.4));
        
        
        System.out.println("Floor value of 5.3 = "+Math.floor(5.3));
        System.out.println("Floor value of 5.9 = "+Math.floor(5.9));
        System.out.println("Floor value of -4.9 = "+Math.floor(-4.9));
        System.out.println("Floor value of -4.0 = "+Math.floor(-4.0));
        System.out.println("Floor value of 3.0 = "+Math.floor(3.0));
    
        
        System.out.println("Ceil value of 5.3 = "+Math.ceil(5.3));
        System.out.println("Ceil value of 5.9 = "+Math.ceil(5.9));
        System.out.println("Ceil value of -4.9 = "+Math.ceil(-4.9));
        System.out.println("Ceil value of -4.0 = "+Math.ceil(-4.0));
        System.out.println("Ceil value of 3.0 = "+Math.ceil(3.0));
    
        /*
         * Commands like Math.log, Math.tan, Math.cos & Math.sin 
         * Gives answer in data type double
         */
        System.out.println(Math.random());
        //System.out.println((int)(Math.random()*50)+1);
        System.out.println((int)(Math.random()*200)+200);
        
        //System.out.println(500+(int)(Math.random()*300));
    }
}
