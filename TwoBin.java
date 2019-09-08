import java.util.*;
class TwoBin
{
    long m,n;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Decimal Integers");
        m=in.nextLong();
        n=in.nextLong();
    }
    long convertDec(long num)
    {
        if(num<=1)
        return num;
        else
        {
            long d=num%2;
            long r=convertDec(num/2);
            return r*10+d;
        }
    }
    void show()
    {
        long bin=convertDec(m);
        long bin2=convertDec(n);
        long fin=convertDec(m+n);
        System.out.println("Binary of "+m+" = "+bin);
        System.out.println("Binary of "+n+" = "+bin2);
        System.out.println("Sum of "+bin+" and "+bin2+" = "+fin);
    }
    public static void main(String args[])
    {
        TwoBin ob=new TwoBin();
        ob.accept();
        ob.show();
    }
}