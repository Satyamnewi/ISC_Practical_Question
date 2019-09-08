import java.util.*;
class MagicRecur
{
    int n;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        n=in.nextInt();
    }
    int sum(int n)
    {
       if(n<10)
       return n;
       else
       return n%10+sum(n/10);
    }
    int reverse(int k)
    {
        if(k<10)
        return k;
        else
        {
            int l=(Integer.toString(k)).length();
            return k%10*(int)Math.pow(10,l-1)+reverse(k/10);
        }
    }
    void check()
    {
        int k=sum(n);
        int d=reverse(k);
        int product=k*d;
        if(product==n)
        System.out.println("Magic Number");
        else
        System.out.println("Not a Magic Number");
    }
    public static void main(String args[])
    {
        MagicRecur ob=new MagicRecur();
        ob.accept();
        ob.check();
    }
}