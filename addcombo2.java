import java.util.*;
class addcombo2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        long sum=0,k=0,dig=0,div,i;
        System.out.println("Combination are: ");
        for(i=11;i<Math.pow(10,n);i++)
        {
            sum=k=0;
            for(div=i;div>0;div/=10)
            {
                dig=div%10;
                if(dig==0)
                k=1;
                sum=sum+dig;
            }
            if(sum==n&&k!=1)
            {
                for(div=i;div>0;div/=10)
                System.out.print(div%10+" ");
                
                System.out.println();
            }
        }
    }
}