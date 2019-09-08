import java.util.*;
class fascinate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,found=0;
        char ch;
        System.out.println("Enter a no.");
        n=in.nextInt();
        String s=Integer.toString(n)+Integer.toString(n*2)+Integer.toString(n*3);
        int a[]={0,0,0,0,0,0,0,0,0,0};
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            a[ch-48]++;
        }
        for(i=0;i<10;i++)
        {
            if(a[i]!=1)
            {
                found++;
                break;
            }
        }
        if(found==0)
        System.out.println("Fascinating No.");
        else
        System.out.println("Not a fascinating no.");
    }
}