class stringsum
{
    public static void main(String args[])
    {
        int d=54;
        String dd=Integer.toString(d);
        System.out.println("In String form: "+dd);
        String s="258";
        int sum=0;
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            for(int i=0;i<9;i++)
            {
                int k=48;
                k=k+i;
                if((char)k==ch)
                {
                    sum=sum+i;
                }
            }
        }
        System.out.println("Sum is: "+sum);
    }
}