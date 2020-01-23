
public class Purchase extends Stock
{
    int pqty;
    float prate;

    Purchase(String item, float rate, int qty, float amt, int pqty, float prate)
    {
        super(item,rate,qty,amt);
        this.pqty=pqty;
        this.prate=prate;
    }

    void update()
    {
        if(prate!=rate)
        {
            rate=prate;
        }
    }

    void display()
    {
        super.display();
        update();
        super.amt=prate*pqty; //amt of stock class
        System.out.println("Purchased items: ");        
        System.out.println("Rate: "+prate);
        System.out.println("Qty: "+pqty);
        System.out.println("Amt: "+amt);
    }

    public static void main()
    {
        Purchase ob=new Purchase("Saabu",35.0f,20,35.0f*20,5,40.0f);
        ob.display();        
    }
}

    
    
    