import java.util.*;
class Binary2          //This is Normal recursive method using two parameters
{
    long bin;
    long dec;
    void readBin()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a binary number");
        bin=in.nextLong();
    }
    long convertDec(long bin,int weight)
    {
        if(bin==0)
        return 0;
        else
        {
            return(bin%2)*(int)Math.pow(2,weight)+convertDec(bin/10,weight+1);
        }

    }
    void Show()
    {
        System.out.println("Binary Number is: "+bin);
        dec=convertDec(bin,0);
        System.out.println("Decimal Number is: "+dec);
    }
}