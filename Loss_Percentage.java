import java.util.Scanner;
 public class lo{
    public static void main(String[] args){
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        double loss=(x-y)*100.0/x;
        System.out.printf("%.2f",loss);
    }
}