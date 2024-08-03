import java.util.Scanner;
public class vol{
    public static void main(String[] args){
        int r;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        double a = 4/3f*(3.14*r*r*r);
        System.out.printf("%.2f",a);
    }
}