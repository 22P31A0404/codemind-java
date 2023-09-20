import java.util.Scanner;
public class n
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float area;
        area=0.5f*a*b;
        System.out.printf("%.0f",area);
        
    }
}