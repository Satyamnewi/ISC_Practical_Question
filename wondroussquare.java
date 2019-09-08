import java.util.*;
class wondroussquare
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,c,s=5,sum=0,cc=0;
        int a[][]=new int[5][5];
        System.out.println("Enter array elements");
        for(r=0;r<s;r++)
        {
            for(c=0;c<s;c++)
            {
                a[r][c]=in.nextInt();
            }
        }
        for(r=0;r<s;r++)
        {
            sum=0;
            for(c=0;c<s;c++)
            {
                sum=sum+a[r][c];
            }
            if((sum!=(0.5*s*(s*s+1))))
            cc++;
        }
        for(c=0;c<s;c++)
        {
            sum=0;
            for(r=0;r<s;r++)
            {
                sum=sum+a[r][c];
            }
            if((sum!=(0.5*s*(s*s+1))))
            cc++;
        }
        if(cc==0)
        System.out.println("Its a wondrous square");
        else
        System.out.println("Not a wondrous square");
    }
}
        