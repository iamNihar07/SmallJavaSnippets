package BasicPrograms;

/**
 * Water tax
 * 100 gallons free
 * next 200 gallons 200/gallon
 * next 300 gallons 500/gallon
 * more than 600 gallons 1000/gallon


*/

public class SlabWater
{
    static void main(int g)
    {
        double amt=0;
        if(g<=100)
        {            
        }
        else if(g>100 && g<=300)
        {
            amt=(g-100)*200;
        }
        else if(g>300 && g<=600)
        {
            amt=(200*200)+(g-300)*500;
        }
        else if(g>600)
        {
            amt=(200*200)+(300*500)+((g-600)*1000);
        }
        System.out.println("Amount to be paid ="+amt);
    }   
}        
        
    

    