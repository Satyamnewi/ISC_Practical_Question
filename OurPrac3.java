import java.util.*;
class OurPrac3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,max=0;
        char ch;
        System.out.println("Enter n");
        n=in.nextInt();
        String a[]=new String[n+1];
        System.out.println("Enter team names");
        for(int i=0;i<n+1;i++)
        {
            a[i]=in.nextLine();
        }
        int len[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            len[i]=a[i].length();
        }
        for(int i=0;i<n+1;i++)
        {
            max=Math.max(len[i],max);
        }
        char get[][]=new char[max][n+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<len[i];j++)
            {
                ch=a[i].charAt(j);
                get[j][i]=ch;
            }
        }
        System.out.println("Pattern:");
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                System.out.print(get[i][j]+"\t");
            }
            System.out.println();
        }
    }
}