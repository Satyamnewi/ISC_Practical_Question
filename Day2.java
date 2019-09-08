import java.util.*;
class Day2
{
    String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
    int arr[]={31,59,90,120,151,181,212,243,273,304,334,365};
    int dn,year,totaldn,p,dn2;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter day no. and year");
        dn=in.nextInt();
        year=in.nextInt();
    }
    int checkleap(int year2)
    {
        if(year2%4==0)
        return 1;
        else
        return 0;
    }
    void yearupdate(int year2)
    {
        int k=checkleap(year2);
        if(k==1)
        {
            totaldn=366;
            for(int i=1;i<12;i++)
            arr[i]=arr[i]+1;
        }
        else
        {
            totaldn=365;
        }
    }
    void check()
    {
        yearupdate(year);
        for(int j=1;true;j++)
        {
            if(dn<=totaldn)
            {
                for(int i=0;i<12;i++)
                {
                    if(i==0)
                    {
                        p=0;
                        dn2=dn;
                        break;
                    }
                    else if(dn<arr[i])
                    {
                        p=i-1;
                        dn2=dn-arr[p];
                        break;
                    }
                }
            }
            else
            {
                dn=dn-totaldn;
                yearupdate(year++);
            }
        }
    }
    void display()
    {
        System.out.println(dn2+" "+month[p+1]+" , "+year);
    }
    public static void main(String args[])
    {
        Day2 ob=new Day2();
        ob.accept();
        ob.check();
        ob.display();
    }
}
