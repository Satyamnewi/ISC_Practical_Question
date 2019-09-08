import java.util.*;
class sortouterelements
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,c,s=3,k=0,t=0,i,j;
        int a[][]=new int[3][3];
        int b[]=new int[9];
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
            for(c=0;c<s;c++)
            {
                if(r==0||c==0||r==s-1||c==s-1)
                {
                   b[k]=a[r][c];
                   k++;
                }
            }
        }
        for(i=0;i<k-1;i++)
        {
            for(j=0;j<(k-1-i);j++)
            {
                if(b[j]>b[j+1])
                {
                    t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        k=0;
        for(r=0;r<s;r++)
        {
            for(c=0;c<s;c++)
            {
                if(r==0||c==0||r==s-1||c==s-1)
                {
                    System.out.print(b[k]+"  ");
                    k++;
                }
                else
                {
                    System.out.print(a[r][c]+"  ");
                }
            }
            System.out.println();
        }
    }
}