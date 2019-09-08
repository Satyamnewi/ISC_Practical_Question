import java.util.*;
class OdisRecur
{
    int n,c;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a numebr");
        n=in.nextInt();
    }
    void check(String s,int i)
    {
        if(i==s.length())
        return;
        else
        {
            if(s.charAt(i)=='0')
            c++;
            check(s,i+1);
        }
    }
    long decimaltobinary(int n)
    {
        if(n<=1)
        return n;
        else
        {
            long d=n%2;
            long r=decimaltobinary(n/2);
            return r*10+d;
        }
    }
    void print()
    {
        long d=decimaltobinary(n);
        System.out.println("Binary Form: "+d);
        check(Long.toString(d),0);
        System.out.println("No. of Zeroes: "+c);
        if(c%2==1)
        System.out.println("Odis Number");
        else
        System.out.println("Not a Odis Number");
    }
    public static void main(String args[])
    {
        OdisRecur ob=new OdisRecur();
        ob.accept();
        ob.print();
    }
}