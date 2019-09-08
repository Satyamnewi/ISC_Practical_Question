import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter limits of two arrays");
        int n=in.nextInt();
        int m=in.nextInt();
        String a[]=new String[n];
        String b[]=new String[m];
        String c[]=new String[m+n];
        System.out.println("Enter elements of array A");
        for(int i=0;i<n;i++)
        {
           a[i]=in.nextLine();
           c[i]=a[i];
        }
        System.out.println("Enter elements of array B");
        for(int i=0;i<m;i++)
        {
           b[i]=in.nextLine();
           c[i+n]=b[i];
        }
        String t="";
        for(int i=1;i<=(m+n)-1;i++)
        {
            for(int j=0;j<(m+n)-i;j++)
            {
                if(c[j].compareTo(c[j+1])>0)
                {
                    t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;
                }
            }
        }
        System.out.println("Sorted Merged array");
        for(int i=0;i<(m+n);i++)
        System.out.println(c[i]);
    }
}