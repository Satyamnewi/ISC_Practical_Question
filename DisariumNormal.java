import java.util.*;
class DisariumNormal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. to check");
        int n=in.nextInt();
        int div,dig,sum=0,l=(Integer.toString(n)).length();
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            sum=sum+(int)(Math.pow(dig,l--));
        }
        System.out.println("Sum is: "+sum);
        if(sum==n)
        System.out.println("disarium");
        else
        System.out.println("not disarium");
    }
}