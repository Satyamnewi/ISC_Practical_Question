import java.util.*;
class ISBN
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long n,d=10,sum=0;
        long a[]=new long[10];
        System.out.println("Enter a code");
        n=in.nextLong();
        long div,dig;
        int k=0,i;
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            a[k]=dig;
            k++;
        }
        for(i=9;i>=0;i--)
        {
            sum=sum+(d*a[i]);
            d--;
        }
        System.out.println("Sum is: "+sum);
        if(sum%11==0)
        System.out.println("ISBN Number");
        else
        System.out.println("Not an ISBN Number");
    }
}
        