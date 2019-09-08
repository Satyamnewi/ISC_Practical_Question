import java.util.*;
class Primefactors
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        for(int i=2;n>1;)
        {
            if(n%i==0)
            {
               System.out.print(i+" ");
               n=n/i;
            }
            else
            i++;
        }
    }
}