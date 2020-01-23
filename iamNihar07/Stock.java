
public class Stock
{
    int qty;
    float rate,amt;
    String item;
    Stock(String item,float rate, int qty, float amt)
    {
        this.qty=qty;
        this.rate=rate;
        this.amt=amt;
        this.item=item;
    }
    
    void display()
    {
        amt=qty*rate;
        System.out.println("In stock: ");
        System.out.println("Item: "+item);
        System.out.println("Rate: "+rate);
        System.out.println("Qty: "+qty);
        System.out.println("Amt: "+amt);
    }
}
        
        
    