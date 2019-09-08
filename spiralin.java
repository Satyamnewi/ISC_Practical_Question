import java.util.*;
class spiralin
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[5][5];
        int s=5,r,c,n=1,i=0;
        for(i=0;i<(int)Math.ceil(s/2.0);i++)
        {
            for(c=i;c<s-i;c++)
            a[i][c]=n++;
            for(r=i+1;r<s-i;r++)
            a[r][s-i-1]=n++;
            for(c=s-2-i;c>=i;c--)
            a[s-i-1][c]=n++;
            for(r=s-2-i;r>i;r--)
            a[r][i]=n++;
        }
        for(r=0;r<s;r++)
        {
            for(c=0;c<s;c++)
            {
                System.out.print(a[r][c]+"      ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
    