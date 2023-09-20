import java.util.Scanner;
public class N
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,v;
        int a=sc.nextInt();
        s=6*(a*a);
        v=(a*a*a);
        System.out.printf("Surface area = %d and Volume = %d",s,v);
    }
}