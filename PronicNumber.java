//Pronic Number : A pronic number, oblong number, rectangular number or heteromecic number, is a number which
// is the product of two consecutive integers, that is, n (n + 1).
//The first few pronic numbers are:
//0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
import java.util.*;
class PronicNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag = 0;
    
        for(int i=1; i<=n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
         
        if(flag == 1)
            System.out.println(n+" is a Pronic Number.");
        else
            System.out.println(n+" is not a Pronic Number.");      
    }
}
