import java.util.*;
class Pallincont
{
    int n,newno;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no.");
        n=in.nextInt();
        newno=n;
    }
    int reverse(int k)
    {
        if(k<10)
        return k;
        else
        {
            return k%10*(int)Math.pow(10,(Integer.toString(k)).length()-1)+reverse(k/10);
        }
    }
    int checkpallin(int k)
    {
        int rev=reverse(k);
        if(rev==k)
        return 1;
        else
        return 0;
    }
    void check()
    {
        int no=0,c=0,k=0,sum=0;
        for(int i=1;true;i++)
        {
            k=reverse(newno);
            sum=k+newno;
            if(checkpallin(sum)==1)
            {
               no=sum;
               break;
            }
            else
            {
               c++;
               newno=sum;
            }
        }
        System.out.println("Original No."+n);
        System.out.println("Its pallindrome no.: "+no);
        System.out.println("Found in step: "+(c+1));
    }
    public static void main(String args[])
    {
        Pallincont ob=new Pallincont();
        ob.accept();
        ob.check();
    }
}