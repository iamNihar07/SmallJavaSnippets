package STRING_HANDLING;
public class Substring
{
    static void main()
    {
        String s = "India";
        
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(2));
        //System.out.println(s.substring(3,0));
        //starting value cant be bigger than ending value
        //System.out.println(s.substring(3,7));
        //index goes out of bounds
        //System.out.println(s.substring(10));
        //String out of bounds again
        //all runtime errors
        
    }
}
        