import java.util.*;
class addcombo
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,sum=0,k=0,n,c=0,j=0;
        System.out.println("Enter no.");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
            sum=i;
            j=i+1;//adding consecutive no. till sum is less than the given no.
            while(sum<n)
            {
                sum=sum+j;
                j++;
            }    //while will be false when the sum is equal to greater than the given no.
                 //so we will be printing the series of no. when the no. is equal to the give no
                 //i=keeping record of first no. of series
                 //j=last no. of series
            if(sum==n)
            {
                for(k=i;k<j;k++)
                {
                    if(k==i)
                    System.out.print(k);
                    else
                    System.out.print("+"+k);
                }
                System.out.println();
            }
        }
    }
}