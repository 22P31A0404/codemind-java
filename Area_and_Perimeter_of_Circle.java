import java.util.Scanner;
public class N
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float a=(3.14f*r*r);
        float p=(2*3.14f*r);
        System.out.printf("%.2f
",a);
        System.out.printf("%.2f",p);
        
    }
}