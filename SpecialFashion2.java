import java.util.*;
class SpecialFashion2
{
    String s;
    int x,y;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter sentence");
        s=in.nextLine()+" ";
        System.out.println("Enter word numbers to change");
        x=in.nextInt();
        y=in.nextInt();
    }
    void check()
    {
        System.out.println("Result is: ");
        char ch,ch2,ch3;
        int c=0,l=0;
        String w="",s1="",w2="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            w=w+ch;
            else
            {
                ++c;
                if(c==x||c==y)
                {
                    for(int j=0;j<w.length();j++)
                    {
                        ch2=w.charAt(j);
                        if((ch2>='a'&&ch2<='y')||(ch2>='A'&&ch2<='Y'))
                        l=(int)(ch2+1);
                        else if(ch2=='z'||ch2=='Z')
                        l=(int)(ch2-23);
                        ch3=(char)(l);
                        w2=w2+ch3;
                    }
                    w=w2;
                }
                s1=s1+" "+w;
                w="";
                w2="";
            }
        }
        System.out.print(s1);
    }
    public static void main(String args[])
    {
        SpecialFashion2 ob=new SpecialFashion2();
        ob.accept();
        ob.check();
    }
}