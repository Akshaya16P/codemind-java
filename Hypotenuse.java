import java.util.Scanner;
public class Hypo{
    public static void main(String[] args){
        double a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextDouble();
        b=read.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",c);
    }
}