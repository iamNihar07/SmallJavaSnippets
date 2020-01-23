package For_Loop;
public class For_Loop9
{
    public static void main() //finding sum of series 1/2 - 2/3 + 3/4 - 4/5......-10/11
    { double i;
      double s=0;
      
      for(i=1;i<=10;i++)
      { if(i%2==0)
        { s=s-i/i+1;
        }
        else
        { s=s+i/i+1;
        }
        }      
      System.out.println("The sum of the series is "+s);
    }
}
       