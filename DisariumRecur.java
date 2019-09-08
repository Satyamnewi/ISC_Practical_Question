import java.util.*;
class DisariumRecur
{
    int n,sum,len;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no. to check");
        n=in.nextInt();
    }
    int checksum(int n,int len)
    {
        if(n<10)
           return (int)Math.pow(n,--len);
        else
        {
           return (int)Math.pow(n%10,len)+checksum(n/10,len--);
        }
    }
    int checksum2(int n,int len)
    {
        if(n<10)
           return (int)Math.pow(n,--len);
        else
        {
           return (int)Math.pow(n%10,len)+checksum(n/10,--len);
        }
    }
    void print()
    {
        int l=Integer.toString(n).length();
        int sum=0;
        if(l==2)
        sum=checksum(n,l);
        else
        sum=checksum2(n,l);
        System.out.println("Sum is: "+sum);
        if(sum==n)
        System.out.println("Disarium Number");
        else 
        System.out.println("Not a Disarium No.");
    }
    public static void main(String args[])
    {
        DisariumRecur ob=new DisariumRecur();
        ob.accept();
        ob.print();
    }
}