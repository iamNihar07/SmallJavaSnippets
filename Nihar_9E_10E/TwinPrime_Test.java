import java.io.*;
public class TwinPrime_Test
{ 
    void main ()throws IOException //twin prime test
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the two nos.");
        int x=Integer.parseInt(in.readLine());
        int y=Integer.parseInt(in.readLine());
        int i;
        boolean flaga=true; boolean flagb=true;
        for(i=2;i<x;i++)
        { if(x%i==0)
            { flaga=false;
                break; 
            }
        }
        for(i=2;i<y;i++)
        { if(y%i==0)
            { flagb=false;
                break;
            }
        }
        if(flaga==true && flagb==true)
        { if(x-y==2 || x-y==-2)
            { System.out.println("TWIN PRIMES.");}
            else
            {System.out.println("NOT TWIN PRIMES.");} 
        }
            else
            { System.out.println("Nos are not Prime.");
            }
            }
}

     