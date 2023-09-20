import java.util.Scanner;
public class N
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z,n,t;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        t=(5*x)+(10*y);
        n=t/z;
        System.out.printf("%d",n);
    }
}