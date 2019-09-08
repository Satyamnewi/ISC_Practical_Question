import java.util.*;
class Binary            //This is Integer.parse Method
{
    long bin;
    long dec;
    void readBin()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a binary number");
        bin=in.nextLong();
    }
    void convertDec()
    {
        String l=Long.toString(bin);
        dec=Long.parseLong(l,2);
        System.out.println(dec);
    }
}