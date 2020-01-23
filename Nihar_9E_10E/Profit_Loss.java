

public class Profit_Loss
{
    void main(float cp, float sp)
    { float p = sp-cp;
      float l = cp-sp;
      float pp=(100+p)/100*cp;
      float lp=(100-l)/100*cp;
      if(sp>cp)
      {System.out.println("The profit is = "+p);
          System.out.println("Proft percent "+pp);}
      else if(cp>sp)
      {System.out.println("The loss is ="+p);
          System.out.println("Loss Percent "+lp);}
    }
}