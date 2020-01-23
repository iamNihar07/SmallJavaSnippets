package BasicPrograms;
public class Salary
{
    /**WAP to calc and display the salary of an employee whose basic pay is 15k rs. The sal is 
    *calculated as follows -
    *gross pay = net pay - pf
    *net pay = basic + da + hra
    *da=110% of basic
    *hra=33% of basic
    *pf=12% of basic
    */
    static void main()
    {
        int basic = 15000;
        double da=0;
        double hra=0;
        double pf=0;
        double np=0;
        double gp=0;
        
        da=1.1*basic;
        hra=0.33*basic;
        pf=0.12*basic;
        np=basic+da+hra;
        gp=np-pf;
        
        System.out.println("Basic - "+basic);
        System.out.println("HRA- "+hra);
        System.out.println("DA- "+da);
        System.out.println("PF- "+pf);
        System.out.println("Netpay= "+np);
        System.out.println("Gross pay= "+gp);
    }
}

