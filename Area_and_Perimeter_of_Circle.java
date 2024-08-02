import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        int r;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        double a,p;
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.printf("%.2f
",a);
        System.out.printf("%.2f",p);
    }
}