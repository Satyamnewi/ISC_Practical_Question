import java.util.*;
class isc2016
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w="",minw="",t2="",r="",r2="";
        System.out.println("Enter a sentence");
        s=in.nextLine()+" ";
        char ch;
        String a[]=new String[50];
        int l=s.length(),i,l2=0,min=100,c=0,k=0,j,t=0;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
               w=w+ch;
            }
            else
            {
                a[k]=w;
                k++;
                char ch3=w.charAt(0);
                char ch4=w.charAt(w.length()-1);
                if((ch3=='a'||ch3=='e'||ch3=='i'||ch3=='o'||ch3=='u')&&(ch4=='a'||ch4=='e'||ch4=='i'||ch4=='o'||ch4=='u'))
                {
                    c++;
                    r=r+" "+w+" ";
                }
                else
                r2=r2+" "+w+" ";
                w="";
            }
        }
        System.out.println("Total no. of words beginning and ending with vowel are: "+c);
        System.out.print(r+" "+r2);
    }
}