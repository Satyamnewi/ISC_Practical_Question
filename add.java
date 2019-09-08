import java.util.*;
class add
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,div,dig,s=0;
        System.out.println("Enter the starting limit");
        m=in.nextInt();
        System.out.println("Enter a no. whose sum need to be done");
        n=in.nextInt();
        for(i=m;i<100000;i++)
        {
            s=0;
            for(div=i;div>0;div/=10)
            {
                dig=div%10;
                s=s+dig;
            }
            if(s==n)
            {
                System.out.println("Smallest Possible intger whose sum add upto "+n+" is: "+i);
                break;
            }
        }
    }
}