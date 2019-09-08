import java.util.*;
class compositemagic
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j,c=0,div,dig,s=0,s2=0;
        System.out.println("Enter the start term");
        m=in.nextInt();
        System.out.println("Enter the last term");
        n=in.nextInt();
        for(i=m;i<=n;i++)
        {
            c=0;
            s=0;
            s2=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            for(div=i;div>0;div/=10)
            {
                dig=div%10;
                s=s+dig;
            }
            for(div=s;div>0;div/=10)
            {
                dig=div%10;
                s2=s2+dig;
            }
            if(c>2&&s2==1)
            System.out.print(i+" ");
        }
    }
}