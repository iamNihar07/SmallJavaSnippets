

import java.io.*;
public class unit_converter
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    int ch;
    int t_id[]={1,2,3,4,5,6,7,8,9,10};
    String t_main[]={"Currency","Currency","Scientific","Scientific","Scientific","Scientific","Scientific","Scientific","Scientific","Scientific"};
    String t_subt[]={"Others To Ruppee","Ruppee to Others","Length         ","Mass          ","Time             ","Temperature     ","Energy          ","Speed          ","Volume          ","Power          "};
    int t_Count[]={0,0,0,0,0,0,0,0,0,0};
    static void main()throws IOException
    {
        unit_converter ob=new unit_converter();
        ob.welc();
    }

    void display()throws IOException
    {
        clrscr();
        line();
        System.out.println(gap()+"Welcome to Unit Converter©");
        System.out.println(gap()+"enter 1 for currency conversion");
        System.out.println(gap()+"enter 2 for scientific conversion");
        System.out.println(gap()+"enter 3 for History of Conversions used");
        System.out.println(gap()+"enter 4 to quit");

        ch=trycatch();
        clrscr();        
        if(ch==1)
        {
            currency_conversion();
        }
        else if(ch==2)
        {
            scientific_conversion();
        }
        else if(ch==3)
        {
            history();
        }

        else if(ch==4)
        {
            exitt();
        }
        else
        {
            display();
        }
    }

    void currency_conversion()throws IOException
    {
        line();
        System.out.println(gap()+"1.Rupee to other country's currency conversion");
        System.out.println(gap()+"2. Other country's Currency  to  Rupee conversion");
        System.out.println(gap()+"3. Go back"); 
        System.out.println(gap()+"4.quit");

        ch=trycatch();
        clrscr();    
        if(ch==1)
        {
            indto_other_conversion();
        }
        else if(ch==2)

        {
            otherto_ind_conversion();   
        }
        else if(ch==3)
        {
            display();
        }
        else if(ch==4)
        {
            exitt();
        }
        else
        {
            currency_conversion();
        }
    }

    void indto_other_conversion()throws IOException
    {
        line();
        double r;
        System.out.println(gap()+"01.CONVERT to Afghani"); 
        System.out.println(gap()+"02.CONVERT to Dollar");
        System.out.println(gap()+"03.CONVERT to Taka");
        System.out.println(gap()+"04.CONVERT to Yuan");
        System.out.println(gap()+"05.CONVERT to Egyptian Pound");
        System.out.println(gap()+"06.CONVERT to Swiss Franc");
        System.out.println(gap()+"07.CONVERT to Rupiah");
        System.out.println(gap()+"08.CONVERT to Iranian Rial");
        System.out.println(gap()+"09.CONVERT to Kuwaiti Dinar");
        System.out.println(gap()+"10.CONVERT to Turkish Lira");
        System.out.println(gap()+"11.CONVERT to Yen");
        System.out.println(gap()+"12.CONVERT to Rouble");
        System.out.println(gap()+"13.CONVERT to Rand");
        System.out.println(gap()+"14.CONVERT to British Pound Sterling");
        System.out.println(gap()+"15.CONVERT to Euro");
        System.out.println(gap()+"16.Go Back");

        ch=trycatch();
        clrscr(); 

        switch(ch)
        {
            case 1:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double afg=r*0.832119;            
            Converting();
            System.out.println(gap()+r +" rupees = "+afg+" Afghani");
            indto_other_conversion();

            break;
            case 2:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double dollar=r*0.0149479;
            Converting();
            System.out.println(gap()+r +" rupees = "+dollar+" Dollar");

            indto_other_conversion();
            break;
            case 3:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double taka=r*1.16547;
            Converting();
            System.out.println(gap()+r +" rupees = "+taka+" Taka");
            indto_other_conversion();

            break;
            case 4:            
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double yuan= r*0.0917797;            
            Converting();
            System.out.println(gap()+r +" rupees = "+yuan+" Yuan");
            indto_other_conversion();

            break;
            case 5:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double egp=r*0.104608;
            Converting();
            System.out.println(gap()+r +" rupees = "+egp+" Egyptian Pound");
            indto_other_conversion();

            break;

            case 6:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double sfr=r*0.0138582;
            Converting();
            System.out.println(gap()+r +" rupees = "+sfr+" Swiss Franc");
            indto_other_conversion();

            break;
            case 7:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double rup=r*167.039;
            Converting();
            System.out.println(gap()+r +" rupees = "+rup+" Rupiah");
            indto_other_conversion();

            break;
            case 8:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double ria=r*184.462;
            Converting();
            System.out.println(gap()+r +" rupees = "+ria+" Iranian Rial");
            indto_other_conversion();

            break;
            case 9:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double din=r*0.00428220;
            Converting();
            System.out.println(gap()+r +" rupees = "+din+" Kuwaiti Dinar");
            indto_other_conversion();

            break;
            case 10:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double lir=r*0.0305124;
            Converting();
            System.out.println(gap()+r +" rupees = "+lir+" Turkish Lira");
            indto_other_conversion();

            break;

            case 11:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double yen=r*1.46871;
            Converting();
            System.out.println(gap()+r +" rupees = "+yen+" Yen");
            indto_other_conversion();

            break;
            case 12:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double rou=r*0.497293;
            Converting();
            System.out.println(gap()+r +" rupees = "+rou+" Rouble");
            indto_other_conversion();

            break;
            case 13:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double ran=r*0.155095;
            Converting();
            System.out.println(gap()+r +" rupees = "+ran+" Rand");
            indto_other_conversion();

            break;
            case 14:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double pou=r*0.00968895;
            Converting();
            System.out.println(gap()+r +" rupees = "+pou+" British Pound Sterling"); 
            indto_other_conversion();

            break;
            case 15:
            t_Count[0]++;
            System.out.println(gap()+"enter indian rupee");
            System.out.print(gap());
            r=d_trycatch();
            double eur=r*0.0112834 ;
            Converting();
            System.out.println(gap()+r +" rupees = "+eur+" Euro");  
            indto_other_conversion();

            break;
            case 16:
            currency_conversion();
            break;

            default:
            indto_other_conversion();
        }
    }

    void otherto_ind_conversion()throws IOException
    {

        line();
        double r;
        System.out.println(gap()+"01. Afghani to Indian Ruppee "); 
        System.out.println(gap()+"02. Dollar to Indian Ruppee");
        System.out.println(gap()+"03. Taka to Indian Ruppee");
        System.out.println(gap()+"04. Yuan to Indian Ruppee");
        System.out.println(gap()+"05. Egyptian Pound to Indian Ruppee");
        System.out.println(gap()+"06. Swiss Franc to Indian Ruppee");
        System.out.println(gap()+"07. Rupiah to Indian Ruppee");
        System.out.println(gap()+"08. Iranian Rial to Indian Ruppee");
        System.out.println(gap()+"09. Kuwaiti Dinar to Indian Ruppee");
        System.out.println(gap()+"10. Turkish Lira to Indian Ruppee");
        System.out.println(gap()+"11. Yen to Indian Ruppee");
        System.out.println(gap()+"12. Rouble to Indian Ruppee");
        System.out.println(gap()+"13. Rand to Indian Ruppee");
        System.out.println(gap()+"14. British Pound Sterling to Indian Ruppee");
        System.out.println(gap()+"15. Euro to Indian Ruppee");
        System.out.println(gap()+"16.Go Back");

        ch=trycatch();
        clrscr();  

        switch(ch)
        {
            case 1:
            t_Count[1]++;
            System.out.println(gap()+"ENTER AFGHANI");
            System.out.print(gap());
            double afg=d_trycatch();
            r=afg/0.832119; 
            Converting();
            System.out.println(gap()+afg+" Afghanis ="+ r +" Ruppees");
            otherto_ind_conversion();
            break;

            case 2:
            t_Count[1]++;
            System.out.println(gap()+"ENTER USA DOLLARS");
            System.out.print(gap());
            double dollar=d_trycatch();
            r=dollar/0.0149479;
            Converting();
            System.out.println(gap()+dollar+" USA Dollars ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 3:
            t_Count[1]++;
            System.out.println(gap()+"ENTER TAKAS");
            System.out.print(gap());
            double taka=d_trycatch();
            r=taka/1.16547;
            Converting();
            System.out.println(gap()+taka+" Takas ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 4:  
            t_Count[1]++;
            System.out.println(gap()+"ENTER Yuan");
            System.out.print(gap());
            double yuan=d_trycatch();
            r= yuan/0.0917797;
            Converting();
            System.out.println(gap()+yuan+" Yuans ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 5:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Egyptian Pound");
            System.out.print(gap());
            double egp=d_trycatch();
            r=egp/0.104608;
            Converting();
            System.out.println(gap()+egp+" Egyptian Pounds ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 6:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Swiss Francs");
            System.out.print(gap());
            double sfr=d_trycatch();
            r=sfr/0.0138582;
            Converting();
            System.out.println(gap()+sfr+" Swiss Francs ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 7:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rupiah");
            System.out.print(gap());
            double rup=d_trycatch();
            r=rup/167.039;
            Converting();
            System.out.println(gap()+rup+" Rupiahs ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 8:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Iranian Rial");
            System.out.print(gap());
            double ria=d_trycatch();
            r=ria/184.462;
            Converting();
            System.out.println(gap()+ria+" Iranian Rials ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 9:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Kuwaiti Dinar");
            System.out.print(gap());
            double din=d_trycatch();
            r=din/0.00428220;
            Converting();
            System.out.println(gap()+din+" Kuwaiti Dinars ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 10:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Turkish Lira");
            System.out.print(gap());
            double lir=d_trycatch();
            r=lir/0.0305124;
            Converting();
            System.out.println(gap()+lir+" Turkish Lira ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 11:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Yen");
            System.out.print(gap());
            double yen=d_trycatch();
            r=yen/1.46871;
            Converting();
            System.out.println(gap()+yen+" Yens ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 12:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rouble");
            System.out.print(gap());
            double rou=d_trycatch();
            r=rou/0.497293;
            Converting();
            System.out.println(gap()+rou+" Roubles ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 13:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rand");
            System.out.print(gap());
            double rand=d_trycatch();
            r=rand/0.155095;
            Converting();
            System.out.println(gap()+rand+" Rands ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 14:
            t_Count[1]++;
            System.out.println(gap()+"ENTER British Pound Sterling");
            System.out.print(gap());
            double pou=d_trycatch();         
            r=pou/0.00968895;
            Converting();
            System.out.println(gap()+pou+" British Pound Sterlings ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 15:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Euro");
            System.out.print(gap());
            double eur=d_trycatch();                          
            r=eur/0.0112834 ;
            Converting();
            System.out.println(gap()+eur+" Euros ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;
            case 16:
            currency_conversion();
            break;

            default:
            otherto_ind_conversion();
        }
    }

    void scientific_conversion()throws IOException
    {
        clrscr();
        line();
        System.out.println(gap()+"01--> Length Conversion");
        System.out.println(gap()+"02--> Mass Conversion");
        System.out.println(gap()+"03--> Time Conversion");
        System.out.println(gap()+"04--> Temperature Conversion");
        System.out.println(gap()+"05--> Energy Conversion");
        System.out.println(gap()+"0          r=sfr/0.0138582;
            Converting();
            System.out.println(gap()+sfr+" Swiss Francs ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 7:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rupiah");
            System.out.print(gap());
            double rup=d_trycatch();
            r=rup/167.039;
            Converting();
            System.out.println(gap()+rup+" Rupiahs ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 8:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Iranian Rial");
            System.out.print(gap());
            double ria=d_trycatch();
            r=ria/184.462;
            Converting();
            System.out.println(gap()+ria+" Iranian Rials ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 9:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Kuwaiti Dinar");
            System.out.print(gap());
            double din=d_trycatch();
            r=din/0.00428220;
            Converting();
            System.out.println(gap()+din+" Kuwaiti Dinars ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 10:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Turkish Lira");
            System.out.print(gap());
            double lir=d_trycatch();
            r=lir/0.0305124;
            Converting();
            System.out.println(gap()+lir+" Turkish Lira ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 11:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Yen");
            System.out.print(gap());
            double yen=d_trycatch();
            r=yen/1.46871;
            Converting();
            System.out.println(gap()+yen+" Yens ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 12:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rouble");
            System.out.print(gap());
            double rou=d_trycatch();
            r=rou/0.497293;
            Converting();
            System.out.println(gap()+rou+" Roubles ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 13:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Rand");
            System.out.print(gap());
            double rand=d_trycatch();
            r=rand/0.155095;
            Converting();
            System.out.println(gap()+rand+" Rands ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 14:
            t_Count[1]++;
            System.out.println(gap()+"ENTER British Pound Sterling");
            System.out.print(gap());
            double pou=d_trycatch();         
            r=pou/0.00968895;
            Converting();
            System.out.println(gap()+pou+" British Pound Sterlings ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;

            case 15:
            t_Count[1]++;
            System.out.println(gap()+"ENTER Euro");
            System.out.print(gap());
            double eur=d_trycatch();                          
            r=eur/0.0112834 ;
            Converting();
            System.out.println(gap()+eur+" Euros ="+ r +" Ruppees");
            otherto_ind_conversion();

            break;
            case 16:
            currency_conversion();
            break;

            default:
            otherto_ind_conversion();
        }
    }

    void scientific_conversion()throws IOException
    {
        clrscr();
        line();
        System.out.println(gap()+"01--> Length Conversion");
        System.out.println(gap()+"02--> Mass Conversion");
        System.out.println(gap()+"03--> Time Conversion");
        System.out.println(gap()+"04--> Temperature Conversion");
        System.out.println(gap()+"05--> Energy Conversion");
        System.out.println(gap()+"0*0.0393;
            Converting();
            System.out.println(gap()+mim+" Millimetres = "+inch+" Inches");
            mm();
            break;

            case 5:
            length();
            break;

            default :
            mm();
        }
    }

    void cm()throws IOException
    {
        line();
        double cem;
        System.out.println(gap()+"1.To Milli-metre");
        System.out.println(gap()+"2.To Metre");
        System.out.println(gap()+"3.To Kilo -metre");
        System.out.println(gap()+"4.To Inch");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();

        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in cm you want to convert");
            System.out.print(gap());
            cem=Integer.parseInt(in.readLine());
            double mim=cem*10;
            Converting();
            System.out.println(gap()+cem+ " Centi-metres = "+mim +"Milli-metres");
            cm();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in cm you want to convert");
            System.out.print(gap());
            cem=Integer.parseInt(in.readLine());
            double metre=cem/100;
            Converting();
            System.out.println(gap()+cem+" Centimetres = "+metre+ "Metres");
            cm();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in cm you want to convert");
            System.out.print(gap());
            cem=Integer.parseInt(in.readLine());
            double kilo=cem/100000;
            Converting();
            System.out.println(gap()+cem+ " Centimetres ="+kilo+ " Kilo-metres");
            cm();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in cm you want to convert");
            System.out.print(gap());
            cem=Integer.parseInt(in.readLine());
            double inch=cem*0.393;
            Converting();
            System.out.println(gap()+cem+" Centimetres = "+inch+" Inches");
            cm();
            break;

            case 5:
            length();
            break;

            default :
            cm();
        }
    }

    void m()throws IOException
    {
        line();
        double met;
        System.out.println(gap()+"1.To Milli -metre");
        System.out.println(gap()+"2.To Centi -metre");
        System.out.println(gap()+"3.To Kilo  -metre");
        System.out.println(gap()+"4.To Inch");
        System.out.println(gap()+"5.To Foot");
        System.out.println(gap()+"6.To Yards");
        System.out.println(gap()+"7.Go Back");

        ch=trycatch();

        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double mim=met/1000;
            Converting();
            System.out.println(gap()+met+ " Metres = "+mim +"Milli-metres");
            m();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double cem=met*100;
            Converting();
            System.out.println(gap()+met+" Metres = "+cem+ "Centi-Metres");
            m();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double kilo=met/1000;
            Converting();
            System.out.println(gap()+met+ " Metres ="+kilo+ " Kilo-metres");
            m();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double inch=met*39.3;
            Converting();
            System.out.println(gap()+met+" Metres = "+inch+" Inches");
            m();
            break;

            case 5:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double fo=met/0.3048;
            Converting();
            System.out.println(gap()+met+" Metres = "+fo + "Feet");
            m();
            break;

            case 6:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in m you want to convert");
            System.out.print(gap());
            met=d_trycatch();
            double y=met*1.093;
            Converting();
            System.out.println(gap()+met+" Metres= "+y+" Yards");
            m();
            break;

            case 7:
            length();
            break;

            default :
            m();
        }
    }

    void km()throws IOException
    {
        line();
        double kilo;
        System.out.println(gap()+"1.To Milli -metre");
        System.out.println(gap()+"2.To Centi -metre");
        System.out.println(gap()+"3.To Metre");
        System.out.println(gap()+"4.To Inch");
        System.out.println(gap()+"5.To Foot");
        System.out.println(gap()+"6.To Yards");
        System.out.println(gap()+"7.To Miles");
        System.out.println(gap()+"8.To Nautical Miles");
        System.out.println(gap()+"9.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double mm=kilo*1000000;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+mm+" Metres");
            km();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double cm=kilo*100000;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+cm+"Centi-Metres");
            km();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double m=kilo*1000;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+m+"Metres");
            km();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double inch=kilo*39370.1;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+inch+"Inches");
            km();
            break;

            case 5:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double foot=kilo*3280.84;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+foot+"Feet");
            km();
            break;

            case 6:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double yards=kilo*1093.61;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+yards+"Yards");
            km();
            break;

            case 7:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double mile=kilo*0.621371;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+mile+"Miles");
            km();
            break;

            case 8:
            t_Count[2]++;
            System.out.println(gap()+"Enter Value in Kilometres You want to convert");
            System.out.print(gap());
            kilo=d_trycatch();
            double nmile=kilo*0.539957;
            Converting();
            System.out.println(gap()+kilo+" KiloMetres ="+nmile+"Nautical-Miles");
            km();
            break;

            case 9:
            length();
            break;

            default:
            km();

        }
    }

    void foot()throws IOException
    {
        line();
        double f;
        System.out.println(gap()+"1.To CentiMetres");
        System.out.println(gap()+"2.To Inches");
        System.out.println(gap()+"3.To Metres");
        System.out.println(gap()+"4.To Yards");
        System.out.println(gap()+"5.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in foot you want to convert");
            System.out.print(gap());
            f=d_trycatch();
            double cm=f*30.48;
            Converting();
            System.out.println(gap()+f+" Feet="+cm+" CentiMetres");
            foot();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in foot you want to convert");
            System.out.print(gap());
            f=d_trycatch();
            double inch=f*12;
            Converting();
            System.out.println(gap()+f+" Feet="+inch+" Inches");
            foot();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in foot you want to convert");
            System.out.print(gap());
            f=d_trycatch();
            double m=f*0.3048;
            Converting();
            System.out.println(gap()+f+" Feet="+m+" Metres");
            foot();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in foot you want to convert");
            System.out.print(gap());
            f=d_trycatch();
            double yard=f*0.333333;
            Converting();
            System.out.println(gap()+f+" Feet="+yard+" Yards");
            foot();
            break;

            case 5:
            length();
            break;

            default:
            km();

        }

    }

    void miles()throws IOException
    {
        line();
        double mile;
        System.out.println(gap()+"1.To Kilo-Metres");
        System.out.println(gap()+"2.To Metres");
        System.out.println(gap()+"3.To Centi-Metres");
        System.out.println(gap()+"4.To Yards");
        System.out.println(gap()+"5.To Foot");
        System.out.println(gap()+"6.To Inch");
        System.out.println(gap()+"7.To Nautical Miles");
        System.out.println(gap()+"8.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double km=mile*1.6093;
            Converting();
            System.out.println(gap()+mile +" Miles ="+km+" Kilo metres");
            miles();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double m=mile*1609.3;
            Converting();
            System.out.println(gap()+mile +" Miles ="+m+"  metres");
            miles();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double cm=mile*160934;
            Converting();
            System.out.println(gap()+mile +" Miles ="+cm+" Centi metres");
            miles();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double yard=mile*1760;
            Converting();
            System.out.println(gap()+mile +" Miles ="+yard+" Yards");
            miles();
            break;

            case 5:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double f=mile*5280;
            Converting();
            System.out.println(gap()+mile +" Miles ="+f+" Feet");           
            miles();
            break;

            case 6:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double i=mile*63360;
            Converting();
            System.out.println(gap()+mile +" Miles ="+i+" Inches");
            miles();
            break;

            case 7:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Miles you want to convert");
            System.out.print(gap());
            mile=d_trycatch();
            double nm=mile*0.868976;
            Converting();
            System.out.println(gap()+mile +" Miles ="+nm+" Nautical Miles");
            miles();
            break;

            case 8:
            length();
            break;

            default:
            miles();
        }
    }

    void nau()throws IOException
    {
        line();
        double n;
        System.out.println(gap()+"1.To miles");
        System.out.println(gap()+"2.To Kilo Metres");
        System.out.println(gap()+"3.To Metres");
        System.out.println(gap()+"4.To Centi- Metres");
        System.out.println(gap()+"5.To Yards");
        System.out.println(gap()+"6.To Foot");
        System.out.println(gap()+"7.To Inch");
        System.out.println(gap()+"8.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double mile=n*1.15078;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+mile+" Miles");
            nau();
            break;

            case 2:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double km=n*1.852;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+km+" Kilo Metres");
            nau();
            break;

            case 3:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double m=n*1852;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+m+" Metres");
            nau();
            break;

            case 4:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double cm=n*185200;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+cm+" CentiMetres");
            nau();
            break;

            case 5:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double yard=n*2025.37;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+yard+" Yards");
            nau();
            break;

            case 6:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double f=n*6076.12;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+f+" Feet");
            nau();
            break;

            case 7:
            t_Count[2]++;
            System.out.println(gap()+"Enter value in Nautical Miles you want to convert");
            System.out.print(gap());
            n=d_trycatch();
            double inch=n*72913.4;
            Converting();
            System.out.println(gap()+n+" Nautical Miles="+inch+" Inches");
            nau();
            break;

            case 8:
            length();
            break;

            default:
            nau();
        }
    }

    void temperature()throws IOException
    {
        line();
        System.out.println(gap()+"01. Kelvin to others");
        System.out.println(gap()+"02. Celsius to others");
        System.out.println(gap()+"03. Fahrenheit to others");
        System.out.println(gap()+"04. Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:

            kelvin();

            break;

            case 2:

            celsius();

            break;

            case 3:

            fah();

            break;

            case 4:

            scientific_conversion();

            break;

            default:
            temperature();
        }

    }

    void kelvin()throws IOException
    {
        line();
        System.out.println(gap()+"01.To Celsius");
        System.out.println(gap()+"02.To Fahrenheit");
        System.out.println(gap()+"03.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Kelvin");
            System.out.print(gap());
            double t=d_trycatch();
            clrscr(); 
            double cel=(t-273);
            Converting();
            System.out.println(gap()+t+" Kelvin ="+cel+" Celsius");
            kelvin();
            break;

            case 2:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Kelvin");
            System.out.print(gap());
            double t1=d_trycatch();
            clrscr(); 
            double cels=(t1-273);
            double f1=1.8*cels;
            double f2=f1+32;
            Converting();
            System.out.println(gap()+t1+" Kelvin ="+f2+" Fahrenheit");
            kelvin();
            break;

            case 3:
            temperature();
            break;

            default:
            kelvin();
        }
    }

    void celsius()throws IOException
    {
        line();
        System.out.println(gap()+"01.To Kelvin");
        System.out.println(gap()+"02.To Fahrenheit");
        System.out.println(gap()+"03.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Celsius");
            System.out.print(gap());
            double t=d_trycatch();
            clrscr(); 
            double k=t+273;
            Converting();
            System.out.println(gap()+t+" Celsius ="+k+" Kelvin");
            celsius();
            break;

            case 2:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Celsius");
            System.out.print(gap());
            double cels=d_trycatch();
            clrscr();             
            double f1=1.8*cels;
            double f2=f1+32;
            Converting();
            System.out.println(gap()+cels+" Celsius ="+f2+" Fahrenheit");
            celsius();
            break;

            case 3:
            temperature();
            break;

            default:
            celsius();
        }

    }

    void fah()throws IOException
    {
        line();
        System.out.println(gap()+"01.To Kelvin");
        System.out.println(gap()+"02.To Celsius");
        System.out.println(gap()+"03.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Fahrenheit");
            System.out.print(gap());
            double t=d_trycatch();
            clrscr(); 
            double cels=5*(t-32)/9;
            double k=cels+273;
            Converting();
            System.out.println(gap()+t+" Fahrenheit ="+k+" Kelvin");
            fah();
            break;

            case 2:
            t_Count[5]++;
            System.out.println(gap()+"Enter temperature in Fahrenheit");
            System.out.print(gap());
            double f=d_trycatch();
            clrscr();             
            double cel=5*(f-32)/9;
            Converting();
            System.out.println(gap()+f+" Fahrenheit ="+cel+" Celsius");
            fah();
            break;

            case 3:
            temperature();
            break;

            default:
            fah();
        }

    }

    void mass()throws IOException
    {
        line();
        System.out.println(gap()+"1.Kilo Gram To Others");
        System.out.println(gap()+"2.Gram To Others");
        System.out.println(gap()+"3.Ton To Others");
        System.out.println(gap()+"4.Pound To Others");
        System.out.println(gap()+"5.Ounce To Others");
        System.out.println(gap()+"6.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)

        {
            case 1:
            kg();
            break;

            case 2:
            g();
            break;

            case 3:
            ton();
            break;

            case 4:
            pound();
            break;

            case 5:
            ounce();
            break;

            case 6:
            scientific_conversion();
            break;

            default:
            mass();
        }
    }

    void kg()throws IOException
    {
        line();
        double kilog;
        System.out.println(gap()+"1.To Milli Grams");
        System.out.println(gap()+"2.To Grams");
        System.out.println(gap()+"3.To Tons");
        System.out.println(gap()+"4.To Pounds");
        System.out.println(gap()+"5.To Ounces");
        System.out.println(gap()+"6.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in KiloGrams You want to convert");System.out.print(gap());
            kilog=d_trycatch();
            double mg=kilog*1000000;
            Converting();
            System.out.println(gap()+kilog+" Kilo Grams="+mg+"Milli Grams");
            kg();

            break;
            case 2:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in KiloGrams You want to convert");System.out.print(gap());
            kilog=d_trycatch();
            double g=kilog*1000;
            Converting();
            System.out.println(gap()+kilog+" Kilo Grams="+g+" Grams");
            kg();
            break;            

            case 3:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in KiloGrams You want to convert");System.out.print(gap());
            kilog=d_trycatch();
            double ton=kilog*0.001;
            Converting();
            System.out.println(gap()+kilog+" Kilo Grams="+ton+"Tons");
            kg();
            break;

            case 4:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in KiloGrams You want to convert");System.out.print(gap());
            kilog=d_trycatch();
            double p=kilog*2.20462;
            Converting();
            System.out.println(gap()+kilog+" Kilo Grams="+p+"Pounds");
            kg();
            break;

            case 5:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in KiloGrams You want to convert");System.out.print(gap());
            kilog=d_trycatch();
            double o=kilog*35.274;
            Converting();
            System.out.println(gap()+kilog+" Kilo Grams="+o+" Ounces");
            kg();
            break;

            case 6:
            mass();
            break;

            default:
            kg();
        }
    }

    void pound()throws IOException
    {
        line();
        double p;
        System.out.println(gap()+"1.To Milli Grams");
        System.out.println(gap()+"2.To Grams");
        System.out.println(gap()+"3.To Ton");
        System.out.println(gap()+"4.To KiloGrams");
        System.out.println(gap()+"5.To Ounces");
        System.out.println(gap()+"6.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Pounds You want to convert");System.out.print(gap());
            p=d_trycatch();
            double mg=p*453592;
            Converting();
            System.out.println(gap()+p+" Pounds="+mg+"Milli Grams");
            pound();

            break;
            case 2:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Pounds You want to convert");System.out.print(gap());
            p=d_trycatch();
            double g=p*453.592;
            Converting();
            System.out.println(gap()+p+" Pounds="+g+" Grams");
            pound();
            break;            

            case 3:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Pounds You want to convert");System.out.print(gap());
            p=d_trycatch();
            double t=p*0.000453;
            Converting();
            System.out.println(gap()+p+" Pounds="+t+" Tons");
            pound();
            break;

            case 4:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Pounds You want to convert");System.out.print(gap());
            p=d_trycatch();
            double kg=p*0.453592;
            Converting();
            System.out.println(gap()+p+" Pounds="+kg+"Kilo Grams");
            pound();
            break;

            case 5:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Pounds You want to convert");System.out.print(gap());
            p=d_trycatch();
            double o=p*16;
            Converting();
            System.out.println(gap()+p+" Pounds="+o+" Ounces");
            pound();
            break;

            case 6:
            mass();
            break;

            default:
            pound();
        }

    }

    void g()throws IOException
    {
        line();
        double g;
        System.out.println(gap()+"1.To Milli Grams");
        System.out.println(gap()+"2.To Kilo Grams");
        System.out.println(gap()+"3.To Tons");
        System.out.println(gap()+"4.To Pounds");
        System.out.println(gap()+"5.To Ounces");
        System.out.println(gap()+"6.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Grams You want to convert");System.out.print(gap());
            g=d_trycatch();
            double mg=g*1000;
            Converting();
            System.out.println(gap()+g+" Grams="+mg+"Milli Grams");
            g();

            break;
            case 2:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Grams You want to convert");System.out.print(gap());
            g=d_trycatch();
            double kg=g*0.001;
            Converting();
            System.out.println(gap()+g+"  Grams="+kg+" KiloGrams");
            g();
            break;            

            case 3:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Grams You want to convert");System.out.print(gap());
            g=d_trycatch();
            double ton=g*0.000001;
            Converting();
            System.out.println(gap()+g+" Grams="+ton+"Tons");
            g();
            break;

            case 4:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Grams You want to convert");System.out.print(gap());
            g=d_trycatch();
            double p=g*0.00220462;
            Converting();
            System.out.println(gap()+g+"  Grams="+p+"Pounds");
            g();
            break;

            case 5:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Grams You want to convert");System.out.print(gap());
            g=d_trycatch();
            double o=g*0.035274;
            Converting();
            System.out.println(gap()+g+" Grams="+o+" Ounces");
            g();
            break;

            case 6:
            mass();
            break;

            default:
            g();
        }
    }

    void ton()throws IOException
    {
        line();
        double t;
        System.out.println(gap()+"1.To Kilo Grams");
        System.out.println(gap()+"3.To Grams");
        System.out.println(gap()+"3.To Pounds");
        System.out.println(gap()+"4.To Ounces");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ton You want to convert");System.out.print(gap());
            t=d_trycatch();
            double kg=t*1000;
            Converting();
            System.out.println(gap()+t+" Tons="+kg+"Kilo Grams");
            ton();

            break;
            case 2:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ton You want to convert");System.out.print(gap());
            t=d_trycatch();
            double g=t*1000000;
            Converting();
            System.out.println(gap()+t+" Tons="+g+" Grams");
            ton();
            break;            

            case 3:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ton You want to convert");System.out.print(gap());
            t=d_trycatch();
            double p=t*2204.62;
            Converting();
            System.out.println(gap()+t+" Tons="+p+" Pounds");
            ton();
            break;

            case 4:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ton You want to convert");System.out.print(gap());
            t=d_trycatch();
            double o=t*35274;
            Converting();
            System.out.println(gap()+t+" Tons="+o+" Ounces");
            ton();
            break;

            case 5:
            mass();
            break;
            default:
            ton();
        }
    }

    void ounce()throws IOException
    {
        line();
        double o;
        System.out.println(gap()+"1.To Kilo Grams");
        System.out.println(gap()+"3.To Grams");
        System.out.println(gap()+"3.To Pounds");
        System.out.println(gap()+"4.To Milli Grams");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ounce You want to convert");System.out.print(gap());
            o=d_trycatch();
            double kg=o*0.0283495;
            Converting();
            System.out.println(gap()+o+" Ounces="+kg+"Kilo Grams");
            ounce();
            break;

            case 2:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ounce You want to convert");System.out.print(gap());
            o=d_trycatch();
            double g=o*28.3495;
            Converting();
            System.out.println(gap()+o+" Ounces="+g+" Grams");
            ounce();
            break;

            case 3:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ounce You want to convert");System.out.print(gap());
            o=d_trycatch();
            double mg=o*28349.5;
            Converting();
            System.out.println(gap()+o+" Ounces="+mg+"Milli Grams");
            ounce();
            break;

            case 4:
            t_Count[3]++;
            System.out.println(gap()+"Enter the value in Ounce You want to convert");System.out.print(gap());
            o=d_trycatch();
            double p=o*0.0625;
            Converting();
            System.out.println(gap()+o+" Ounces="+p+"Pounds");
            ounce();
            break;

            case 5:
            mass();
            break;

            default:
            ounce();
        }
    }

    void energy()throws IOException
    {
        line();
        System.out.println(gap()+"01.Joule to others");
        System.out.println(gap()+"02.Kilojoule to others");
        System.out.println(gap()+"03.Megajoule to others");     
        System.out.println(gap()+"04.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            Joule();
            break;

            case 2:
            Kiloj();
            break;

            case 3:
            MegaJoule();
            break;

            case 4:
            scientific_conversion();
            break;

            default:
            energy();
        }
    }

    void Joule()throws IOException
    {
        line();
        double ene;
        System.out.println(gap()+"1.Joule to Kilo-Joule");
        System.out.println(gap()+"2.Joule to Mega-Joule");
        System.out.println(gap()+"3.Joule to Kilo watt hour");
        System.out.println(gap()+"4.Joule to Electron-Volt");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Joule");System.out.print(gap());
            ene=d_trycatch();
            double kj=ene*0.001;
            Converting();
            System.out.println(gap()+ene+" Joules ="+kj+" Kilo-Joules");
            Joule();
            break;

            case 2:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Joule");System.out.print(gap());
            ene=d_trycatch();
            double mj=ene*0.000001;
            Converting();
            System.out.println(gap()+ene +" Joules ="+mj+" Mega-Joules");
            Joule();
            break;

            case 3:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Joule");System.out.print(gap());
            ene=d_trycatch();
            double kw=ene/3600000;
            Converting();
            System.out.println(gap()+ene+" Joules ="+kw+" Kilo watt hours");
            Joule();
            break;

            case 4:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Joule");System.out.print(gap());
            ene=d_trycatch();
            double ev=ene*1.6;
            Converting();
            System.out.println(gap()+ene+" Joules ="+ev+"x10^-19 Electron-volt ");
            Joule();
            break;

            case 5:
            energy();
            break;

            default :
            Joule();

        }
    }

    void Kiloj()throws IOException
    {
        line();
        double ene;
        System.out.println(gap()+"1.Kilo-Joule to Joule");
        System.out.println(gap()+"2.Kilo-Joule to Mega-Joule");
        System.out.println(gap()+"3.Kilo-Joule to Kilo watt hour");
        System.out.println(gap()+"4.Kilo-Joule to Electron-Volt");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();

        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Kilo-Joule");System.out.print(gap());
            ene=d_trycatch();
            double j=ene*1000;
            Converting();
            System.out.println(gap()+ene+" Kilo-Joules ="+j+" Joules");
            Kiloj();
            break;

            case 2:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Kilo-Joules");System.out.print(gap());
            ene=d_trycatch();
            double mj=ene*0.001;
            Converting();
            System.out.println(gap()+ene +" Kilo-Joules ="+mj+" Mega-Joules");
            Kiloj();
            break;

            case 3:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Kilo-Joule");System.out.print(gap());
            ene=d_trycatch();
            double kw=ene/3600;
            Converting();
            System.out.println(gap()+ene+"Kilo-Joules ="+kw+" Kilo watt hours");
            Kiloj();
            break;

            case 4:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Kilo-Joule");System.out.print(gap());
            ene=d_trycatch();
            double ev=ene*1.6;
            Converting();
            System.out.println(gap()+ene+" Kilo-Joules ="+ev+"x10^-22 Electron-volt ");
            Kiloj();
            break;

            case 5:
            energy();
            break;

            default :
            Kiloj();

        }

    }

    void MegaJoule()throws IOException
    {
        line();
        double ene;
        System.out.println(gap()+"1.Mega-Joule to Joule");
        System.out.println(gap()+"2.Mega-Joule to Kilo-Joule");
        System.out.println(gap()+"3.Mega-Joule to Kilo watt hour");
        System.out.println(gap()+"4.Mega-Joule to Electron-Volt");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();
        clrscr(); 
        switch(ch)
        {
            case 1:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Mega-Joule");System.out.print(gap());
            ene=d_trycatch();
            double j=ene*1000000;
            Converting();
            System.out.println(gap()+ene+" Mega-Joules ="+j+" Joules");
            MegaJoule();
            break;

            case 2:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Mega-Joules");System.out.print(gap());
            ene=d_trycatch();
            double kj=ene*1000;
            Converting();
            System.out.println(gap()+ene +" Mega-Joules ="+kj+" Kilo-Joules");
            MegaJoule();
            break;

            case 3:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Mega-Joule");System.out.print(gap());
            ene=d_trycatch();
            double kw=ene/0.36;
            Converting();
            System.out.println(gap()+ene+"Mega-Joules ="+kw+" Kilo watt hours");
            MegaJoule();
            break;

            case 4:
            t_Count[6]++;
            System.out.println(gap()+"Enter Energy in Mega-Joule");System.out.print(gap());
            ene=d_trycatch();
            double ev=ene*1.6;
            Converting();
            System.out.println(gap()+ene+" Mega-Joules ="+ev+"x10^-25 Electron-volt ");
            MegaJoule();
            break;

            case 5:
            energy();
            break;

            default :
            MegaJoule();

        }
    }

    void time()throws IOException
    {
        line();
        System.out.println(gap()+"1.Second to Others");
        System.out.println(gap()+"2.Minute to Others");
        System.out.println(gap()+"3.Hour to Others");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            Second();
            break;
            case 2:
            Min();
            break;
            case 3:
            Hour();
            break;
            case 4:
            scientific_conversion();
            break;
            default:
            time();
        }
    }

    void Second()throws IOException
    {
        line();
        double sec;
        System.out.println(gap()+"1.To Minute");
        System.out.println(gap()+"2.To Hours");
        System.out.println(gap()+"3.To Milli-seconds");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in seconds you want to convert");System.out.print(gap());
            sec=d_trycatch();
            double min=sec/60;
            Converting();
            System.out.println(gap()+sec+" Seconds="+min+" Minutes");
            Second();
            break;
            case 2:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in seconds you want to convert");System.out.print(gap());
            sec=d_trycatch();
            double h=sec/3600;
            Converting();
            System.out.println(gap()+sec+" Seconds="+h+" Hours");
            Second();
            break;   
            case 3:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in seconds you want to convert");System.out.print(gap());
            sec=d_trycatch();
            double ms=sec*1000;
            Converting();
            System.out.println(gap()+sec+" Seconds="+ms+" Milli Seconds");
            Second();
            break;
            case 4:
            time();
            break;
            default:
            Second();
        }
    }

    void Min()throws IOException
    {
        line();
        double min;
        System.out.println(gap()+"1.To Seconds");
        System.out.println(gap()+"2.To Hours");
        System.out.println(gap()+"3.To Days");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Minutes you want to convert");System.out.print(gap());
            min=d_trycatch();
            double sec=min*60;
            Converting();
            System.out.println(gap()+min+" Minutes="+sec+" Seconds");
            Min();
            break;

            case 2:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Minutes you want to convert");System.out.print(gap());
            min=d_trycatch();
            double h=min/60;
            Converting();
            System.out.println(gap()+min+" Minutes="+h+" Hours");
            Min();
            break;

            case 3:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Minutes you want to convert");System.out.print(gap());
            min=d_trycatch();
            double d=min*0.00069;
            Converting();
            System.out.println(gap()+min+" Minutes="+d+" Days");
            Min();
            break;

            case 4:
            time();
            break;

            default:
            Min();
        }
    }

    void Hour()throws IOException
    {
        line();
        double h;
        System.out.println(gap()+"1.To Seconds");
        System.out.println(gap()+"2.To Minutes");
        System.out.println(gap()+"3.To Days");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Hours you want to convert");System.out.print(gap());
            h=d_trycatch();
            double sec=h*3600;
            Converting();
            System.out.println(gap()+h+" Hours="+sec+" Seconds");
            Hour();
            break;

            case 2:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Hours you want to convert");System.out.print(gap());
            h=d_trycatch();
            double min=h*60;
            Converting();
            System.out.println(gap()+h+" Hours="+min+" Minutes");
            Hour();
            break;

            case 3:
            t_Count[4]++;
            System.out.println(gap()+"Enter the value in Hours you want to convert");System.out.print(gap());
            h=d_trycatch();
            double d=h/24;
            Converting();
            System.out.println(gap()+h+" Hours="+d+" Days");
            Hour();
            break;

            case 4:
            time();
            break;

            default:
            Hour();
        }
    }

    void speed()throws IOException
    {
        line();
        System.out.println(gap()+"1.Metre per Second(m/s) to others");
        System.out.println(gap()+"2.KiloMetre per Hour(km/h) to others");
        System.out.println(gap()+"3.Knots to others");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            mps();
            break;            
            case 2:
            kmph();
            break;
            case 3:
            knot();
            break;
            case 4:
            scientific_conversion();
            break;
            default:
            speed();
        }
    }

    void mps()throws IOException
    {
        double ms;
        line();
        System.out.println(gap()+"1.To KiloMetre per Hour(km/h)");
        System.out.println(gap()+"2.To Knots");
        System.out.println(gap()+"3.Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[7]++;
            System.out.println(gap()+"Enter value in m/s you want to convert");System.out.print(gap());
            ms=d_trycatch();
            Converting();
            double kmh=3.6*ms;
            System.out.println(gap()+ms+" Metre per Second ="+kmh+" KiloMetre per hour");
            mps();
            break;

            case 2:
            t_Count[7]++;
            System.out.println(gap()+"Enter value in m/s you want to convert");System.out.print(gap());
            ms=d_trycatch();
            Converting();
            double nou=1.9438*ms;
            System.out.println(gap()+ms+" Metre per Second ="+nou+" Knots");
            mps();
            break;

            case 3:
            speed();
            break;

            default:
            mps();
        }
    }

    void kmph()throws IOException
    {

        double k; 
        line();
        System.out.println(gap()+"1.To Metre per Second(m/s)");
        System.out.println(gap()+"2.To Knots");
        System.out.println(gap()+"3.Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[7]++;
            System.out.println(gap()+"Enter value in km/h you want to convert");System.out.print(gap());
            k=d_trycatch();
            Converting();
            double ms=0.277778*k;
            System.out.println(gap()+k+" KiloMetre per hour ="+ms+" Metre per Second ");
            kmph();
            break;

            case 2:
            t_Count[7]++;
            System.out.println(gap()+"Enter value in km/h you want to convert");System.out.print(gap());
            k=d_trycatch();
            Converting();
            double nou=0.5399*k;
            System.out.println(gap()+k+" KiloMetre per hour ="+nou+" Knots ");
            kmph();
            break;

            case 3:
            speed();
            break;

            default:
            kmph();
        }
    }

    void knot()throws IOException
    {
        double kn; 
        line();
        System.out.println(gap()+"1.To Metre per Second(m/s)");
        System.out.println(gap()+"2.To Kilo Metre per Hour");
        System.out.println(gap()+"3.Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[7]++;
            System.out.println(gap()+"Enter Value in Knots which you want to convert");System.out.print(gap());
            kn=d_trycatch();
            double ms=kn*0.51444;
            Converting();
            System.out.println(gap()+kn+" Knots="+ ms +" Metre per Second");
            knot();
            break;

            case 2:
            t_Count[7]++;
            System.out.println(gap()+"Enter Value in Knots which you want to convert");System.out.print(gap());
            kn=d_trycatch();
            double kph=kn*1.852;
            Converting();
            System.out.println(gap()+kn+" Knots="+ kph +" KiloMetre per Hour");
            knot();
            break;

            case 3:
            speed();
            break;
            default:
            knot();
        }
    }

    void volume()throws IOException
    {
        line();
        System.out.println(gap()+"1.Cubic metre to others");
        System.out.println(gap()+"2.Liter to others");
        System.out.println(gap()+"3.Milliliter to others");
        System.out.println(gap()+"4.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {                       
            case 1:
            cmt();
            break;

            case 2:
            l();
            break;
            case 3:
            ml();
            break;
            case 4:
            scientific_conversion();
            break;

            default:
            volume();
        }
    }

    void cmt()throws IOException
    {
        line();
        double cmtre;
        System.out.println(gap()+"1.To Liter");
        System.out.println(gap()+"2.To Milliliters");
        System.out.println(gap()+"3.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in cubic metre you want to convert");System.out.print(gap());
            cmtre=d_trycatch();
            double lit=1000*cmtre;
            Converting();
            System.out.println(gap()+cmtre+" Cubic metres ="+lit+" Litres");
            cmt();
            break;

            case 2:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in cubic metre you want to convert");System.out.print(gap());
            cmtre=d_trycatch();
            double mil=1000000*cmtre;
            Converting();
            System.out.println(gap()+cmtre+" Cubic metres ="+mil+" MilliLitres");
            cmt();
            break;

            case 3:
            volume();
            break;

            default:
            cmt();
        }
    }

    void l()throws IOException
    {
        line();
        double lit;
        System.out.println(gap()+"1.To Cubic Metre");
        System.out.println(gap()+"2.To Milliliters");
        System.out.println(gap()+"3.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in Liters you want to convert");System.out.print(gap());
            lit=d_trycatch();
            double cmetre=lit*0.001;
            Converting();
            System.out.println(gap()+lit+" Liters ="+cmetre+" Cubic Metres");
            l();
            break;

            case 2:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in Liters you want to convert");System.out.print(gap());
            lit=d_trycatch();
            double milli=lit*1000;
            Converting();
            System.out.println(gap()+lit+" Liters ="+milli+" Milli Liters");
            l();
            break;

            case 3:
            volume();
            break;

            default:
            l();
        }
    }

    void ml()throws IOException
    {
        line();
        double milli;
        System.out.println(gap()+"1.To Cubic Metre");
        System.out.println(gap()+"2.To Liters");
        System.out.println(gap()+"3.Go back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in Liters you want to convert");System.out.print(gap());
            milli=d_trycatch();
            double cmetre=milli/1000000;
            Converting();
            System.out.println(gap()+milli+" Milli Liters ="+ cmetre+ " Cubic Metres");
            ml();
            break;

            case 2:
            t_Count[8]++;
            System.out.println(gap()+"Enter value in Liters you want to convert");System.out.print(gap());
            milli=d_trycatch();
            double lit=milli/1000;
            Converting();
            System.out.println(gap()+milli+" Milli Liters ="+ lit+ " Liters");
            ml();
            break;

            case 3:
            volume();
            break;

            default:
            ml();
        }
    }

    void power()throws IOException
    {
        line();
        System.out.println(gap()+"1.Watt to others");
        System.out.println(gap()+"2.KiloWatt to others");
        System.out.println(gap()+"3.MegaWatt to others");
        System.out.println(gap()+"4.Horse Power to others");
        System.out.println(gap()+"5.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            watt();
            break;

            case 2:
            kwatt();
            break;

            case 3:
            mwatt();
            break;

            case 4:
            HP();
            break;

            case 5:
            scientific_conversion();
            break;

            default:
            power();

        }
    }

    void watt()throws IOException    
    {
        line();
        double wat;
        System.out.println(gap()+"1.To Kilo Watt");
        System.out.println(gap()+"2.To Mega Watt");
        System.out.println(gap()+"3.To Horse Power");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();
        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in watt you want to convert");System.out.print(gap());
            wat=d_trycatch();
            double kw=wat*0.001;
            Converting();
            System.out.println(gap()+wat+" Watts =" +kw+" Kilo Watts");
            watt();
            break;

            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in watt you want to convert");System.out.print(gap());
            wat=d_trycatch();
            double mw=wat*0.000001;
            Converting();
            System.out.println(gap()+wat+" Watts =" +mw+" Mega Watts");
            watt();
            break;
            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in watt you want to convert");System.out.print(gap());
            wat=d_trycatch();
            double hpower=wat/746;
            Converting();
            System.out.println(gap()+wat+" Watts =" +hpower+" Horse Power");
            watt();
            break;

            case 4:
            power();
            break;

            default:
            watt();
        }
    }

    void kwatt()throws IOException
    {
        line();
        double kwat;
        System.out.println(gap()+"1.To Watt");
        System.out.println(gap()+"2.To Mega Watt");
        System.out.println(gap()+"3.To Horse Power");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in KiloWatt you want to convert");System.out.print(gap());
            kwat=d_trycatch();
            double wat=kwat*1000;
            Converting();
            System.out.println(gap()+kwat+" KiloWatts =" +wat+" Watts");
            kwatt();
            break;
            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in KiloWatt you want to convert");System.out.print(gap());
            kwat=d_trycatch();
            double mwat=kwat*0.001;
            Converting();
            System.out.println(gap()+kwat+" KiloWatts =" +mwat+" MegaWatts");
            kwatt();
            break;
            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in KiloWatt you want to convert");System.out.print(gap());
            kwat=d_trycatch();
            double hpower=(kwat*1000)/746;
            Converting();
            System.out.println(gap()+kwat+" KiloWatts =" +hpower+" HorsePower");
            kwatt();
            break;
            case 4:
            power();
            break;

            default:
            power();
        }
    }

    void mwatt()throws IOException
    {
        line();
        double mwat;
        System.out.println(gap()+"1.To Watt");
        System.out.println(gap()+"2.To Kilo Watt");
        System.out.println(gap()+"3.To Horse Power");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double wat=mwat*1000000;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +wat+" Watts");
            mwatt();
            break;

            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double kwat=mwat*1000;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +kwat+" KiloWatts");
            mwatt();
            break;

            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double hpower=(mwat*1000000)/746;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +hpower+" Horsepower");
            mwatt();
            break;

            case 4:
            power();
            break;

            default:
            mwatt();
        }
    }

    void HP()throws IOException
    {
        line();
        double hpower;
        System.out.println(gap()+"1.To Watt");
        System.out.println(gap()+"2.To Kilo Watt");
        System.out.println(gap()+"3.To Mega Watt");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double wat=hpower*746;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +wat+" Watts");
            HP();
            break;

            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double kwat=hpower*746000;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +kwat+" KiloWatts");
            HP();
            break;

            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double mwat=hpower*746000000;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +mwat+" MegaWatts");
            HP();
            break;

            case 4:
            power();
            break;

            default:
            HP();
        }
    }

    void Converting()throws IOException
    {
        clrscr();
        System.out.print(gap()+"Converting");

        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        clrscr(); 
        System.out.print(gap()+"Converting");
        for(long i=0;i<=100000000;i++);
        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        clrscr(); 

        System.out.print(gaption
    {
        line();
        double mwat;
        System.out.println(gap()+"1.To Watt");
        System.out.println(gap()+"2.To Kilo Watt");
        System.out.println(gap()+"3.To Horse Power");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double wat=mwat*1000000;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +wat+" Watts");
            mwatt();
            break;

            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double kwat=mwat*1000;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +kwat+" KiloWatts");
            mwatt();
            break;

            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in MegaWatt you want to convert");System.out.print(gap());
            mwat=d_trycatch();
            double hpower=(mwat*1000000)/746;
            Converting();
            System.out.println(gap()+mwat+" MegaWatts =" +hpower+" Horsepower");
            mwatt();
            break;

            case 4:
            power();
            break;

            default:
            mwatt();
        }
    }

    void HP()throws IOException
    {
        line();
        double hpower;
        System.out.println(gap()+"1.To Watt");
        System.out.println(gap()+"2.To Kilo Watt");
        System.out.println(gap()+"3.To Mega Watt");
        System.out.println(gap()+"4.Go Back");

        ch=trycatch();
        clrscr();

        switch(ch)
        {
            case 1:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double wat=hpower*746;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +wat+" Watts");
            HP();
            break;

            case 2:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double kwat=hpower*746000;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +kwat+" KiloWatts");
            HP();
            break;

            case 3:
            t_Count[9]++;
            System.out.println(gap()+"Enter the value in HorsePower you want to convert");System.out.print(gap());
            hpower=d_trycatch();
            double mwat=hpower*746000000;
            Converting();
            System.out.println(gap()+hpower+" HorsePower =" +mwat+" MegaWatts");
            HP();
            break;

            case 4:
            power();
            break;

            default:
            HP();
        }
    }

    void Converting()throws IOException
    {
        clrscr();
        System.out.print(gap()+"Converting");

        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        clrscr(); 
        System.out.print(gap()+"Converting");
        for(long i=0;i<=100000000;i++);
        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        for(long i=0;i<=100000000;i++);

        System.out.print(".");
        clrscr(); 

        System.out.print(ga   }
            catch(Exception e)
            {                

                System.out.println(gap()+"Please Re-enter");
                continue;
            }
            break;
        }
        return (ch);
    }

    void welc()throws IOException
    {
        clrscr();
        line();
        System.out.println(gap()+" _    _  ____  __    ___  _____  __  __  ____ ");
        d();
        System.out.println(gap()+"( \\/\\/ )( ___)(  )  / __)(  _  )(  \\/  )( ___)");
        d();
        System.out.println(gap()+" )    (  )__)  )(__( (__  )(_)(  )    (  )__) ");
        d();
        System.out.println(gap()+"(__/\\__)(____)(____)\\___)(_____)(_/\\/\\_)(____)");
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        display();
    }

    void d()
    {
        for(long i=0;i<100000000;i++);
    }

    void exitt()throws IOException
    {
        line();
        System.out.println(gap()+" _____  _   _   ___   _   _  _   __ __   __ _____  _   _  _  _  _  _ ");
        d();
        System.out.println(gap()+"|_   _|| | | | / _ \\ | \\ | || | / / \\ \\ / /|  _  || | | || || || || |");
        d();
        System.out.println(gap()+"  | |  | |_| |/ /_\\ \\|  \\| || |/ /   \\ V / | | | || | | || || || || |");
        d();
        System.out.println(gap()+"  | |  |  _  ||  _  || . ` ||    \\    \\ /  | | | || | | || || || || |");
        d();
        System.out.println(gap()+"  | |  | | | || | | || |\\  || |\\  \\   | |  \\ \\_/ /| |_| ||_||_||_||_|");
        d();
        System.out.println(gap()+"  \\_/  \\_| |_/\\_| |_/\\_| \\_/\\_| \\_/   \\_/   \\___/  \\___/ (_)(_)(_)(_)");
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        d();
        quit();
    }

    void quit()
    {

        System.exit(0);

    }

}	




