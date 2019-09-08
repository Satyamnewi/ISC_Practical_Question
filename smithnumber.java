import java.util.*;
class smithnumber
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,s=0,so=0,i,j,c=0;
        System.out.println("Enter a number");         
        n=in.nextInt();
        //for(n=1;n<=500;n++)               //To check smith no.s from 1 to 500
        //{
            //s=0;
            //so=0;
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            s=s+dig;
        }
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    c++;
                }
                if(c==2)
                {
                    for(div=i;div>0;div/=10)
                    {
                       dig=div%10;
                       so=so+dig;
                    }
                }
            }
        }
        if(s==so)
        System.out.println("SMITH NO.");
        else
        System.out.println("NOT A SMITH NO.");
    //}
   }
}
