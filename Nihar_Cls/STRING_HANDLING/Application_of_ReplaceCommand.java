package STRING_HANDLING;
public class Application_of_ReplaceCommand
{
    static void main()
    {
        String s1="15th aug is our independence day.";
        String s2="";

        s2=s1.replace("15","26");
        s2=s2.replace("aug","jan");
        s2=s2.replace("independence","republic");

        System.out.println(s1);
        System.out.println(s2);


    }
}
