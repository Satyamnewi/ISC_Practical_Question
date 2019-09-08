import java.util.*;
class EvilRecur
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
            if(s.charAt(i)=='1')
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
        System.out.println("No. of Ones: "+c);
        if(c%2==0)
        System.out.println("Evil Number");
        else
        System.out.println("Not a Evil Number");
    }
    public static void main(String args[])
    {
        EvilRecur ob=new EvilRecur();
        ob.accept();
        ob.print();
    }
}