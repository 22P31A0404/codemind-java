import java.util.Scanner;
public class N
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int a;
      a=sc.nextInt();
      int ld;
      ld=a%100;
      
      System.out.printf("%02d",ld);
      
  }
}