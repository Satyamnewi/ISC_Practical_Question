import java.util.*;
class saddlepoint
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[][]=new int[4][4];
        int r,c,row=4,column=4,largest=0,lowest=a[0][0],cp=0,found=0;
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
            lowest=a[r][0];
            cp=0;
            for(c=0;c<column;c++)
            {
                if(a[r][c]<lowest)
                {
                    lowest=a[r][c];
                    cp=c;
                }
            }
            largest=a[0][cp];
            for(r=0;r<row;r++)
            {
                if(a[r][cp]>largest)
                largest=a[r][cp];
            }
            if(largest==lowest)
            {
                System.out.println("Saddle point is: "+largest);
                found++;
                break;
            }
        }
        if(found==0)
        System.out.println("No saddle point");
    }
}