import java.util.*;
class lettercombination                //Anagrams
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s;
        int i,j,k,l;
        System.out.println("Enter a String");
        s=in.nextLine();
        l=s.length();
        System.out.println("All possible combinations are:");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(j!=i&&i!=k&&j!=k)
                    System.out.println(s.charAt(i)+" "+s.charAt(j)+" "+s.charAt(k));
                }
            }
        }
    }
}