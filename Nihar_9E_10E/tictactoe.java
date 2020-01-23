import java.io.*;
public class tictactoe
{
    InputStreamReader read=new InputStreamReader (System.in);
    BufferedReader in=new BufferedReader(read);
    static char n1;
    static char n2;
    static char n3;
    static char n4;
    static char n5;
    static char n6;
    static char n7;
    static char n8;
    static char n9;
    String p1;
    String p2;
    static String choice;
    static String doyou;
    static int w;
    void constructor()
    {
        n1='1';
        n2='2';
        n3='3';
        n4='4';
        n5='5';
        n6='6';
        n7='7';
        n8='8';
        n9='9';
        w=0;
    }
    void welcome()
    {
        double i;
        System.out.println("WW                    WW  EEEEEEEEEEEE  LLL                 CCCC          OOOO       MM          MM  EEEEEEEEEEEE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("WW                    WW  EE            LLL               C      C     OO      OO    MM  M    M  MM  EE");
        for (i=0;i<=100000000;i++)
         {
        }
        System.out.println("WW                    WW  EE            LLL              C            OO        OO   MM  M    M  MM  EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println(" WW                  WW   EE            LLL             C            OO          OO  MM    MMM   MM  EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("  WW       W        WW    EEEEEE        LLL             C            OO          OO  MM          MM  EEEEEE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("   WW     W  W     WW     EE            LLL              C            OO        OO   MM          MM  EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("    WW   WW  WW   WW      EE            LLL               C      C     OO      OO    MM          MM  EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("     WWWWW    WWWWW       EEEEEEEEEEEE  LLLLLLLLLLLLLL      CCC           OOOO       MM          MM  EEEEEEEEEEEE");
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=5;t++)
        {
             System.out.println();
        }
        System.out.println("TTTTTTTT   IIIIIIII       CCC       TTTTTTTT     AA             CCC         TTTTTTTT      OOO       EEEEEEEE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("  TTT         II       CC     C       TTT       AA AA        CC     C         TTT       OO   OO     EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("  TTT         II      CC        ===   TTT      AAAAAAA      CC        ===     TTT      OO     OO    EEEE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("  TTT         II       CC     C       TTT     AA     AA      CC     C         TTT       OO   OO     EE");
        for (i=0;i<=100000000;i++)
        {
        }
        System.out.println("  TTT      IIIIIIII       CCC         TTT    AA       AA        CCC           TTT         OOO       EEEEEEEE");
        for (i=0.0;i<=100000000;i++)
        {
        }
        for (i=0.0;i<=100000000;i++)
        {
        }
        for (i=0.0;i<=100000000;i++)
        {
        }
        for (i=0.0;i<=100000000;i++)
        {
        }
        System.out.print("\u000c");
    }
    void input()throws IOException
    {
        System.out.println("NEW GAME");
        System.out.println("QUIT GAME");
        for (double i=0.0;i<=100000000;i++)
        {
        }
        System.out.println("Enter your choice");
        choice=in.readLine();
        for (double i=0;i<=1000000000;i++)
        {
        }
        System.out.print("\u000c");
    }
    void players()throws IOException
    {
        System.out.print("P1 your name is ");
        p1=in.readLine();
        System.out.println();
        System.out.print("P2 your name is ");
        p2=in.readLine();
        for (double i=0;i<=1000000000;i++)
        {
        }
        System.out.print("\u000c");
    }
    void instruction()
    {
        System.out.println("INSTRUCTION");
        for (double i=0;i<=100000000;i++)
        {
        }
        System.out.println("P1='X'");
        System.out.println("P2='O'");
        System.out.println("Best of luck");
        System.out.println("Play to WIN");
        design();
        for (double i=0;i<=1000000000;i++)
        {
        }
        for (double i=0;i<=1000000000;i++)
        {
        }     
        System.out.print("\u000c");
    }
    void play()throws IOException
    {
        double i;
        int n=1,ch,s=1,k=0,w=0,h=0;
        design();
        while(n>0)
        {
            while(n==1)
            {
                if (w>=5)
                {
                    break;
                }
                System.out.println("player one plays");
                System.out.println("Enter the place no.");
                ch=Integer.parseInt(in.readLine());
                switch(ch)
                {
                    case 1:
                    if(n1=='X'||n1=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n1='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 2:
                    if(n2=='X'||n2=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n2='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 3:
                    if(n3=='X'||n3=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n3='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.;i++)
        {
        }
        System.out.print("\u000c");
    }
    void instruction()
    {
        System.out.println("INSTRUCTION");
        for (double i=0;i<=100000000;i++)
        {
        }
        System.out.println("P1='X'");
        System.out.println("P2='O'");
        System.out.println("Best of luck");
        System.out.println("Play to WIN");
        design();
        for (double i=0;i<=1000000000;i++)
        {
        }
        for (double i=0;i<=1000000000;i++)
        {
        }     
        System.out.print("\u000c");
    }
    void play()throws IOException
    {
        double i;
        int n=1,ch,s=1,k=0,w=0,h=0;
        design();
        while(n>0)
        {
            while(n==1)
            {
                if (w>=5)
                {
                    break;
                }
                System.out.println("player one plays");
                System.out.println("Enter the place no.");
                ch=Integer.parseInt(in.readLine());
                switch(ch)
                {
                    case 1:
                    if(n1=='X'||n1=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n1='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 2:
                    if(n2=='X'||n2=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n2='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 3:
                    if(n3=='X'||n3=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n3='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 4:
                    if(n4=='X'||n4=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n4='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 5:
                    if(n5=='X'||n5=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n5='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 6:
                    if(n6=='X'||n6=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n6='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 7:
                    if(n7=='X'||n7=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n7='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 8:
                    if(n8=='X'||n8=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n8='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    case 9:
                    if(n9=='X'||n9=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n9='X';
                        design();
                        if((n1==n2&&n2==n3&&n1=='X')||(n4==n5&&n5==n6&&n4=='X')||(n7==n8&&n8==n9&&n7=='X')||(n1==n5&&n5==n9&&n1=='X')||(n3==n5&&n5==n7&&n3=='X')||(n1==n4&&n4==n7&&n1=='X')||(n2==n5&&n5==n8&&n2=='X')||(n3==n6&&n6==n9&&n3=='X'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p1+" WINS");
                            w=5;
                         }
                    }
                    break;
                    default:
                    System.out.println("Wrong Input");
                }
                if (s==0)
                {
                    s=1;
                }
                else
                {
                    n++;
                    w++;
                }
                if(w>=5)
                {
                    n=0;
                    break;
                }
            }
            while(n==2)
            {
                if (w>=5)
                {
                    n=0;
                    break;
                }
                else
                {
                }
                System.out.println("player two plays");
                System.out.println("Enter the place no.");
                ch=Integer.parseInt(in.readLine());
                switch(ch)
                {
                    case 1:
                    if(n1=='X'||n1=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n1='O';
                        design();
                        if((n1==n2&&n2==n3&&n1=='O')||(n4==n5&&n5==n6&&n4=='O')||(n7==n8&&n8==n9&&n7=='O')||(n1==n5&&n5==n9&&n1=='O')||(n3==n5&&n5==n7&&n3=='O')||(n1==n4&&n4==n7&&n1=='O')||(n2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 6:
                    if(n6=='X'||n6=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n6='O';
                        design();
                        if((n1==n2&&n2==n3&&n1=='O')||(n4==n5&&n5==n6&&n4=='O')||(n7==n8&&n8==n9&&n7=='O')||(n1==n5&&n5==n9&&n1=='O')||(n3==n5&&n5==n7&&n3=='O')||(n1==n4&&n4==n7&&n1=='O')||(n2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 7:
                    if(n7=='X'||n7=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n7='O';
                        design();
                        if((n1==n2&&n2==n3&&n1=='O')||(n4==n5&&n5==n6&&n4=='O')||(n7==n8&&n8==n9&&n7=='O')||(n1==n5&&n5==n9&&n1=='O')||(n3==n5&&n5==n7&&n3=='O')||(n1==n4&&n4==n7&&n1=='O')||(n2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 8:
                    if(n8=='X'||n8=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n8='O';
                        design();
                        if((n1==n2&&n2==n3&&n1=='O')||(n4==n5&&n5==n6&&n4=='O')||(n7==n8&&n8==n9&&n7=='O')||(n1==n5&&n5==n9&&n1=='O')||(n3==n5&&n5==n7&&n3=='O')||(n1==n4&&n4==n7&&n1=='O')||(n2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    case 9:
                    if(n9=='X'||n9=='O')
                    {
                        System.out.println("Wrong Input");
                        s=0;
                    }
                    else
                    {
                        n9='O';
                        design();
                        if((n1==n2&&n2==n3&&n1=='O')||(n4==n5&&n5==n6&&n4=='O')||(n7==n8&&n8==n9&&n7=='O')||(n1==n5&&n5==n9&&n1=='O')||(n3==n5&&n5==n7&&n3=='O')||(n1==n4&&n4==n7&&n1=='O')||(n2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    default:
                    System.out.println("Wrong Input");
                }
                if (s==0)
                {
                    s=1;
                }
                else
                {
                    n--;
                }
                if (w==5)
                {
                    n=0;
                    break;
                }
            }
        }
        if (h==0)
        {
            System.out.print("\u000c");
            processing(); 
            System.out.println("OH! NOBODY WINS");
        }
        for (i=0;i<=1000000000;i++)
        {
        }
        System.out.print("\u000c");
    }
    void processing()
    {
        double i;
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.println();
        for (i=0;i<=100000000;i++)
        {
        }
        for (int t=0;t<=112;t++)
        {
            System.out.print(".");
        }
        System.out.print("\u000c");
    }
    void plaq()throws IOException
    {
        System.out.println("Do you want to:-");
        System.out.println("1: PLAY AGAIN");
        System.out.println("2: QUIT GAME");
        System.out.println("Enter the name");
        doyou=in.readLine();
        for (double i=0;i<=1000000000;i++)
        {
        }
        System.out.print("\u000c");
    }
    void design()
    {
      System.out.println("  --------- --------- ---------");
      System.out.println(" |         |         |         |");
      System.out.println(" |   "+n1+"     |    "+n2+"    |   "+n3+"     |");
      System.out.println(" |         |         |         |");
      System.out.println("  --------- --------- ---------");
      System.out.println(" |         |         |         |");
      System.out.println(" |   "+n4+"     |    "+n5+"    |   "+n6+"     |");
      System.out.println(" |         |         |         |");
      System.out.println("  --------- --------- ---------");
      System.out.println(" |         |         |         |");
      System.out.println(" |   "+n7+"     |    "+n8+"    |   "+n9+"     |");
      System.out.println(" |         |         |         |");
      System.out.println("  --------- --------- ---------");
    }
    static void main()throws IOException
    {
        tictactoe ob =new tictactoe();
        ob.welcome();
        int h=1,in=1,e=1;double i;
        while (in==1)
        {
            ob.input();
            if(choice.equalsIgnoreCase("quit game"))
            {
                System.exit(0);
            }
            
            else if (choice.equalsIgnoreCase("new game"))
            {
                in=0;
                ob.constructor();
                ob.instruction();
                while(h==1)
                {
                    ob.constructor();
                    ob.playn2==n5&&n5==n8&&n2=='O')||(n3==n6&&n6==n9&&n3=='O'))
                        {
                            h=1;
                            System.out.print("\u000c");
                            processing();
                            System.out.println("GUESS WHO WINS");
                            for (i=0;i<=1000000000;i++)
                            {
                            }
                            System.out.println(p2+" WINS");
                            w=5;
                        }
                    }
                    break;
                    default:
                    System.out.println("Wrong Input");
                }
                if (s==0)
                {
                    s=1;
                }
                else
                {
                    n--;
                }
                if (w==5)
                {
                    n=0;
                    break;
                }
            }
        }
        if (h==0)
        {
            System.out.print("\u000c");
            processing(); 
            System.out.println("OH! NOBODY WINS");
      