import java.util.*;
class evil
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,c=0,k=0,i;
        System.out.println("Enter a no. to check");
        n=in.nextInt();
        int a[]=new int[9];
        for(div=n;div>0;div/=2)
        {
            dig=div%2;
            a[k]=dig;
            k++;
        }
        System.out.print("Binary Form is:");
        for(i=k-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        for(i=0;i<k;i++)
        {
            if(a[i]==1)
            c++;
        }
        if(c%2==0)
        System.out.println("  Evil Number");
        else
        System.out.println("Not a Evil No.");
    }
}