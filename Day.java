import java.util.*;
class Day
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int monthday[]={31,28,31,30,31,30,31,30,31,30,31,30};
        String monthname[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int mn,s=0,nd,year,da,i,d;
        System.out.println("Enter day no. and year");
        nd=in.nextInt();
        year=in.nextInt();
        mn=1;
        if(year%4==0)
        {
            monthday[1]=29;
        }
        for(i=0;true;mn++)
        {
            if(nd<(s+monthday[i]))
            break;
            s=s+monthday[i++];
            mn++;
        }
        System.out.println((nd-s)+" "+monthname[i]+" "+year);
        System.out.println("Enter days after");
        da=in.nextInt();
        s=0;
        mn=0;
        d=nd+da;
        for(i=0;true;mn++)
        {
            if(d<(s+monthday[i]))
            break;
            s=s+monthday[i++];
            mn++;
        }
        System.out.println((d-s)+" "+monthname[i]+","+year);
    }
}