import java.util.*;
class ddaascending
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,c,s=3,min,i,j;
        int a[][]=new int[3][3];
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
                    for(i=0;i<s;i++)
                    {
                       for(j=0;j<s;j++)
                        {
                            if(a[r][c]< a[i][j])
                            {
                                 min=a[r][c];
                                 a[r][c]=a[i][j];
                                 a[i][j]=min;
                                }
                            }
                        }
                    }
                }
                System.out.println("Sorted Matrix is: ");
                for(r=0;r<s;r++)
                {
                   for(c=0;c<s;c++)
                   {
                      System.out.print  (a[r][c]+"  ");
                   }
                   System.out.println();
                }
            }
        }