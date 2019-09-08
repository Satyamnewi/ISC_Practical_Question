import java.util.*;
class making2darraysymmetricbyaddingelements
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[4][4];
        int b[][]=new int[4][4];
        int r,c,row=4,column=4,found=0,s=0;
        System.out.println("Enter values");
        for(r=0;r<row;r++)
        {
            for(c=0;c<column;c++)
            {
                a[r][c]=in.nextInt();
            }
        }
        for(r=0;r<row;r++)
        {
            for(c=0;c<column;c++)
            {
                b[r][c]=a[c][r];
            }
        }
        for(r=0;r<row;r++)
        {
            for(c=0;c<column;c++)
            {
                if(a[r][c]==b[r][c])
                {
                    found=0;
                }
                else
                {
                    found++;
                    break;
                }
            }
        }
        if(found==0)
        {
            System.out.println("Symmetric");
        }
        else
        {
            System.out.println("Not Symmetric, making it symmetric...");
            for(r=0;r<row;r++)
            {
               for(c=0;c<column;c++)
               {
                   s=a[r][c]+b[r][c];
                   b[r][c]=s;
               }
            }
            for(r=0;r<row;r++)
            {
                for(c=0;c<column;c++)
                {
                    System.out.print(b[r][c]+" ");
                }
                System.out.println();
            }
        }
    }
}
            