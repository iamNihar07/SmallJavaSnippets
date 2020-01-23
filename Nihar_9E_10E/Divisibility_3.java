import java.io.*;
public class Divisibility_3
{ void main() throws IOException
 { InputStreamReader read = new InputStreamReader(System.in);
   BufferedReader in = new BufferedReader(read);
   int a=0;
   a=Integer.parseInt(in.readLine());
   if (a%5==0 && a%10==0)
   {System.out.println("The no is divisible by 5 n 10");}
   else 
   { System.out.println("The no. is nt divisible by 5 n 10");}
}
}

