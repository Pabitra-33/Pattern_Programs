public class pattern
{
  
  public static void main(String args[])
  {
    int i,j;//here i for rows and j for columns
    int row=9;// till this the patteren is going to print *
    for(i=0;i<=row;i++)
    {
      for(j=0;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
}