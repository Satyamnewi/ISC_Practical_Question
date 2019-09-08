                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       import java.util.*;
class bankdenomianation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,div,dig,rev=0,c=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        String s[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for(div=n;div>0;div/=10)
        {
            dig=div%10;
            rev=(rev*10)+dig;
        }
        for(div=rev;div>0;div/=10)
        {
            dig=div%10;
            System.out.print(s[dig]+" ");
        }
        int notes[]={1000,500,100,50,20,10,5,2,1};
        int d=n;
        int totalnotes=0,i;
        c=0;
        System.out.println("\nDenomination:");
        for(i=0;i<9;i++)
        {
            c=n/notes[i];
            if(c!=0)
            {
                System.out.println(notes[i]+"\t*\t"+c+"\t= "+(notes[i]*c));
            }
            totalnotes=totalnotes+c;
            n=n%notes[i];
        }
        System.out.println("Total amount: "+d);
        System.out.println("Total Number of Notes are: "+totalnotes);
    }
}