public class binarypattern
{
    public static void main(String args[])
    {
        int i,j,row=5;
        for(i=1;i<row;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%2==1)
                {
                    System.out.println("0");
                }
                else
                {
                    System.out.println("1");
                }
            }
            System.out.println();

        }
    }
}