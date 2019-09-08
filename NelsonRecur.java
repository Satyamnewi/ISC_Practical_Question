import java.util.*;
class NelsonRecur
{
    int n,i,c;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a numebr");
        n=in.nextInt();
    }
    void outer(String s,int i)
    {
        if(i==s.length())
        return;
        else
        {
            inner(s,i+1);
            outer(s,i+1);
        }
    }
    void inner(String s,int j)
    {
        if(j==s.length())
        return;
        else
        {
            if(s.charAt(i)!=s.charAt(j))
            c++;
        }
    }
    void print()
    {
        outer(Integer.toString(n),0);
        if(c==0)
        System.out.println("Nelson Number");
        else
        System.out.println("Not a Nelson Number");
    }
    public static void main(String args[])
    {
        NelsonRecur ob=new NelsonRecur();
        ob.accept();
        ob.print();
    }
}