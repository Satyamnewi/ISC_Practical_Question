import java.util.*;
class vowel
{
    public static void main(String args[])
    {
        int i,l,c=0;
        Scanner in=new Scanner(System.in);
        String s,s1,w="";
        System.out.println("Enter a sentence");
        s=in.nextLine();
        s1=s.toUpperCase();
        l=s1.length();
        char ch=s1.charAt(l-1);
        if(ch=='?'||ch=='.'||ch=='!')
        {
           for(i=0;i<l;i++)
           {
              char ch1,ch2,ch3;
              ch1=s1.charAt(i);
              if (ch1!=' ')
              {
                  w=w+ch1;
              }
              else
              {
                  int p=w.length();
                  ch2=w.charAt(0);
                  ch3=w.charAt(p-1);
                  if((ch2=='A'||ch2=='E'||ch2=='I'||ch2=='0'||ch2=='U')&&(ch3=='A'||ch3=='E'||ch3=='I'||ch3=='0'||ch3=='U'))
                  {
                      c++;
                  }
                  w="";
              }
           }
           System.out.println("number of words begnning and ending with VOWEL="+(c+1));
        }
        else
        {
            System.out.println("String not valid");
        }
    }
}