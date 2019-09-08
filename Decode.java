import java.util.*;
class Decode
{
    String s;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter message to decode");
        s=in.nextLine();
    }
    String rev()
    {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            s1=ch+s1;
        }
        return s1;
    }
    char asciiconvert(int a)
    {
        char ch;
        ch=(char)a;
        return ch;
    }
    int bool(int b)
    {
        int t=0;
        if((b>=65&&b<=90)||(b>=97&&b<=122)||(b==32))
        t=1;
        return t;
    }
    void print()
    {
        System.out.println("The decoded message is:");
        String s1=rev();
        String s2="";
        int Ascii=0;
        char ch;
        for(int i=0;i<s1.length();i++)
        {
            ch=s1.charAt(i);
            s2=s2+ch;
            Ascii=Integer.parseInt(s2);
            if(bool(Ascii)==1)
            {
                System.out.print(asciiconvert(Ascii));
                s2="";
            }
        }
    }
    public static void main(String args[])
    {
        Decode ob=new Decode();
        ob.accept();;
        ob.print();
    }
}