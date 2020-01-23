import java.io.*;
public class stone_paper_scissor
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Let's play Stone-Paper-Scissor");
        System.out.println("Single player game");

        int i,k=0,k1=0,n;
        int x=1;
        do
        {
            
            while(k!=5 && k1!=5)
            {
                
                System.out.println();
                System.out.println("Enter 0 for stone, 1 for paper & 2 for scissor");
                i=Integer.parseInt(in.readLine());
                System.out.println("\f");
                n=(int)(Math.random()*3);

                if(i==0)
                    System.out.println("You enter Stone");
                else if(i==1)
                    System.out.println("You enter Paper");
                else if(i==2)
                    System.out.println("You enter Scissor");
                else
                {
                    System.out.println("Wrong choice entered");
                    continue;
                }

                if(n==0)
                    System.out.println("Computer does Stone");
                else if(n==1)
                    System.out.println("Computer does Paper");
                else if(n==2)
                    System.out.println("Computer does Scissor");
                else
                    continue;

                if((i==0 && n==1) || (i==1 && n==2) || (i==2 && n==0))
                {
                    System.out.println("Computer wins");
                    k1++;
                }
                else if((i==1 && n==0) || (i==2 && n==1) || (i==0 && n==2))
                {
                    System.out.println("You win");
                    k++;
                }
                else if(i==n)
                {
                    System.out.println("It's a draw");
                }
                System.out.println("Computer : "+k1);
                System.out.println("You : "+k);
            }
            System.out.println();

            if(k==5)
                System.out.println("Congratulations! You win the match");
            else if(k1==5)
                System.out.println("Computer wins the match! Better luck next time");
            
            System.out.println();
            System.out.println("Enter 1 to try again \nEnter any other number to quit");
            x=Integer.parseInt(in.readLine());
            k=k1=0;
            
            System.out.println("\f");
        }
        while(x==1);
        
        System.out.println("Thank you for playing! \n:)");
        System.out.println();
        System.out.println("\t\t    Credits:");
        System.out.println("\t\tNihar Gupte \n\n\n\n\n\n\nAll copyrights reserved.");
    }
}