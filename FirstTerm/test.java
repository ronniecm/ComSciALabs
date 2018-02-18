public class test
{
   public static void main(String[] args)
   {
    for (int h = 0; h<3; h++) { 
      for (int i = 9; i >= 1;i--)
      {
         for (int j = 1; j<=i;j++)
            System.out.print(i);
      }
      System.out.println();
     }
   }
}