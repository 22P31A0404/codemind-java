import java.util.Scanner;
public class N
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int s;
        s=(n*(n+1))/2;
        System.out.printf("%d",s);
    }
}