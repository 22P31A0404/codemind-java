import java.util.Scanner;
public class n
{
    public static void main(String aargs[])
    {
        Scanner sc=new Scanner(System.in);
        int t,h,m;
        t=sc.nextInt();
        h=t/60;
        m=t-h*60;
        System.out.printf("%d Hour(s) %d Minute(s)
",h,m);
    }
}