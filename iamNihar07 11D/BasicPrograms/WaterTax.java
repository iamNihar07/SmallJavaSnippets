package BasicPrograms;

/**
 * The water dept has an annual water conservation tax policy
 * the rates are based on the water consumption of the user
 * the tax rates are as follows:
 *    Water consumed(gallons)         Tax rate/100gallons (Rs)
 *    upto 45                         no tax
 *    more than 45 and less than 75   475
 *    more than 75 and less than 125  750
 *    more than 125 and less than 200 1225
 *    more than 200 and less than 350 1650
 *    more than 350                   2000
 *    
 *WAP to compute and display the annual water tax based on the input value of
 *water consumption
 */
public class WaterTax
{
    static void main(int g)
    {
        double amt=0;
        boolean flag=true;
        if(g>=0 && g<=45)
        {
        }
        else if(g>45 && g<=75)
        {
            amt=(g-45)*4.75;
        }
        else if(g>75 && g<=125)
        {
            amt=((75-45)*4.75)+((g-75)*7.5);
        }
        else if(g>125 && g<=200)
        {
            amt=((75-45)*4.75)+((125-75)*7.5)+((g-125)*12.25);
        }
        else if(g>200 && g<=350)
        {
            amt=((75-45)*4.75)+((125-75)*7.5)+((200-125)*12.25)+((g-200)*16.5);
        }
        else if(g>350)
        {
            amt=((75-45)*4.75)+((125-75)*7.5)+((200-125)*12.25)+((350-200)*16.5)
            +((g-350)*20);
        }
        else
        {
            flag=false;
            System.out.println("Wrong input");
        }
        
        if(flag==true)
        {
            System.out.println("The amount to be paid = "+amt);
        }
    }
}
