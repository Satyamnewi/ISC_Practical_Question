import java.util.*;
class addcomboo
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,s=0,k=0,n,t=0,j=0;
        System.out.println("Enter no.");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=i;j<=n;j++)
            {
                s=0;
                for(k=i;k<=j;k++)
                s=s+k;
                if(s==n)
                {
                    for(t=i;t<=j;t++)
                    {
                        System.out.print(t+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}