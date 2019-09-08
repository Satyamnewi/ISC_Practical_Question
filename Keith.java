/*
A Keith Number is an integer N with ‘d’ digits with the following property:
If a Fibonacci-like sequence (in which each term in the sequence is the sum of the ‘d’ previous terms) is formed,
 with the first ‘d’ terms being the decimal digits of the number N, then N itself occurs as a term in the sequence.

For example, 197 is a Keith number since it generates the sequence
1, 9, 7, 17, 33, 57, 107, 197, ………..
Some keith numbers are: 14 ,19, 28 , 47 , 61, 75, 197, 742, 1104, 1537……………
*/
import java.io.*;
class Keith
{
public static void main(String args[])throws IOException
    {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter the number : "); //inputting the number
     int n=Integer.parseInt(br.readLine());
 
     int copy=n;
     String s=Integer.toString(n);
     int d=s.length(); //finding the number of digits (d) in the number
     int arr[]=new int[n]; //array for storing the terms of the series
      
     for(int i=d-1; i>=0; i--)
     {
         arr[i]=copy%10; //storing the digits of the number in the array
         copy=copy/10;
          
     }
     int i=d,sum=0;
     while(sum<n) //finding the sum till it is less than the number
     {
         sum = 0;
         for(int j=1; j<=d; j++) //loop for generating and adding the previous 'd' terms
         {
             sum=sum+arr[i-j];
         }
         arr[i]=sum; //storing the sum in the array
         i++;
     }
     /* When the control comes out of the while loop, either the 
        sum is equal to the number or greater than it */
 
     if(sum==n) //if sum is equal to the number, then it is a Keith number
        System.out.println("The number is a Keith Number");
     else
        System.out.println("The number is a not a Keith Number");
    }
}
