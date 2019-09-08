import java.util.*;
class ascii
{
    public static void main(String args[])
    {
        String st;
        int i,l;
        char ch;
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        st=in.nextLine();
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            if(Character.isLetter(ch))
            {
                int k=(int)ch;
                System.out.print(k);
            }
            else
            System.out.print(ch);
        }
    }
}
        