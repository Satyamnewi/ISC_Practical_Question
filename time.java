import java.util.*;
class time
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
        String b[]={"Twenty"};
        int n,m,div,dig;
        System.out.println("Enter two integers");
        n=in.nextInt();
        m=in.nextInt();
        dig=m%10;
        if(m==0)
        System.out.println(a[n-1]+" O'clock");//checking for exact hours
        if(m>19&&m<30)
            System.out.println(b[(m/10)-2]+" "+a[dig-1]+" minutes past "+a[n-1]);//checking for minutes past an hour
        if(m>=10&&m<20&&m!=15)
            System.out.println(a[m-1]+" minutes past "+a[n-1]);//checking for minutes less than 20 minutes
        if(m>=40&&m!=45)
            System.out.println(a[(60-m)-1]+" minutes to "+a[n]);//checking for minutes left for next hour
        if(m==30)
            System.out.println("Half past "+a[n-1]);//checking for half an hour
        if(m==45)
           System.out.println("Quarter to "+a[n]);//checking for quarter to time
        if(m==15)
        System.out.println("Quarter past "+a[n-1]);//checking  for quarter past time
    }
}
        