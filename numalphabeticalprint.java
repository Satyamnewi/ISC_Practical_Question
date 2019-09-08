import java.util.*;
class numalphabeticalprint
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String b[]={"Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety","Hundred","Thousand","Lakh","Crore"};
        int n,div,dig,c=0,d,k=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        for(d=n;d>0;d/=10)
        {
            c++;
        }
        k=(int)Math.pow(10,(c-1));
        div=n/k;
        dig=n%k;
        q=(int)Math.pow(10,(c-2));
        p=dig%100;
        r=dig/100;
        s=r/10;
        t=s/10;
        u=t/10;
        v=u/10;
        if(n<20)
        System.out.println(a[n]);
        else if(n>19&&n<100)
        System.out.println(b[div-2]+" "+a[dig]);
        else if(n>99&&n<1000&&dig==0)
        System.out.println(a[div]+" "+b[8]);
        else if(n>99&&n<1000)
        System.out.println(a[div]+" "+b[8]+" "+b[(dig/10)-2]+" "+a[dig%10]);
        else if(n>999&&n<10000&&dig==0)
        System.out.println(a[div]+" "+b[9]);
        else if(n>999&&n<10000)
        System.out.println(a[div]+" "+b[9]+" "+a[dig/100]+" "+b[8]+" "+b[(p/10)-2]+" "+a[n%10]);
        else if(n>9999&&n<100000&&(n/q<20)&&(n%q==0))
        System.out.println(a[n/q]+" "+b[9]);
        else if(n>9999&&n<100000&&div<2)
        System.out.println(a[n/1000]+" "+b[9]+" "+a[r%10]+" "+b[8]+" "+b[(p/10)-2]+" "+a[n%10]);
        else if(n>9999&&n<100000&&div>=2&&dig==0)
        System.out.println(b[(n/k)-2]+" "+b[9]);
        else if(n>9999&&n<100000&&(n/q>20)&&(n%q==0))
        System.out.println(b[div-2]+" "+a[r/10]+" "+b[9]);
        else if(n>9999&&n<100000&&div>=2)
        System.out.println(b[div-2]+" "+a[r/10]+" "+b[9]+" "+a[r%10]+" "+b[8]+" "+b[(p/10)-2]+" "+a[p%10]);
        else if(n>99999&&n<1000000&&c==6&&(n%q==0))
        System.out.println(a[div]+" "+b[10]);
        else if(n>99999&&n<1000000&&c==6)
        System.out.println(a[div]+" "+b[10]+" "+b[(s/10)-2]+" "+a[s%10]+" "+b[9]+" "+a[r%10]+" "+b[8]+" "+b[(p/10)-2]+" "+a[p%10]);
        else if(n>999999&&n<10000000&&c==7&&(n%q==0))
        System.out.println(b[div-2]+" "+a[dig/q]+" "+b[10]);
        else if(n>999999&&n<10000000&&c==7)
        System.out.println(b[div-2]+" "+a[dig/q]+" "+b[10]+" "+b[(t%10)-2]+" "+a[s%10]+" "+b[9]+" "+a[r/1000]+" "+b[8]+" "+b[(p/10)-2]+" "+a[p%10]);
        else if(n>9999999&&n<100000000&&c==8&&(n%q==0))
        System.out.println(a[div]+" "+b[11]);
        else if(n>9999999&&n<100000000&&c==8)
        System.out.println(a[div]+" "+b[11]+" "+b[(dig/q)-2]+" "+a[u%10]+" "+b[10]+" "+b[(t%10)-2]+" "+a[s%10]+" "+b[9]+" "+a[r%10]+" "+b[8]+" "+b[(p/10)-2]+" "+a[p%10]);
        else if(n>99999999&&n<1000000000&&c==9&&(n%q==0))
        System.out.println(b[div-2]+" "+a[dig/q]+" "+b[11]);
        else if(n>99999999&&n<1000000000&&c==9)
        System.out.println(b[div-2]+" "+a[dig/q]+" "+b[11]+" "+b[(v%10)-2]+" "+a[u%10]+" "+b[10]+" "+b[(t%10)-2]+" "+a[s%10]+" "+b[9]+" "+a[r%10]+" "+b[8]+" "+b[(p/10)-2]+" "+a[p%10]);
        else
        System.out.println("Invalid Input!");
    }
}