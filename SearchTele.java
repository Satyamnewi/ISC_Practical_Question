import java.util.*;
class SearchTele
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String names[]=new String[10];
        int num[]=new int[10],t=0,c=0;
        System.out.println("Enter names and respective phone number");
        for(int i=0;i<10;i++)
        {
            names[i]=in.next();
            num[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(names[i]+"\t"+num[i]);
        }
        System.out.println("Enter name whose phone number is to be searched");
        String s=in.next();
        for(int i=0;i<10;i++)
        {
            if(names[i].equalsIgnoreCase(s))
            {
              c=1;
              t=i;
              break;
            }
        }
        if(c==1)
        {
           System.out.println("Details of your searched name");
           System.out.println(s+ " "+num[t]);
        }
        else
        System.out.println("Number not found");
    }
}