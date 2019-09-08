import java.util.*;
class ddasortingofrows
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,c,s=3,t=0,k=0;
        int a[][]=new int[3][3];
        System.out.println("Enter array elements");
        for(r=0;r<s;r++)
        {
            for(c=0;c<s;c++)
            {
                a[r][c]=in.nextInt();
            }
        }
        for (r=0;r<s;r++) 
        {
           for (c=0;c<s;c++)
           {
              for (k=0;k<s-1-c;k++) 
              {
                  if(a[r][k]>a[r][k+1]) 
                  {
                     t = a[r][k];
                     a[r][k] = a[r][k + 1];
                     a[r][k + 1] = t;
                  }
              }
            }
        }
        System.out.println("Sorted Matrix is: ");
        for(r=0;r<s;r++)
        {
            for(c=0;c<s;c++)
            {
                System.out.print(a[r][c]+"  ");
            }
            System.out.println();
        }
    }
}