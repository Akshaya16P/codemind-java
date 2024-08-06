import java.util.Scanner;
public class eo{
    public static void main(String[] args){
        int n,t,m,k;
        Scanner read=new Scanner(System.in);
        t=read.nextInt();
          while(t>0){
        n=read.nextInt();
        m=read.nextInt();
        k=read.nextInt();
        if(n<=m-k){
            System.out.printf("YES
");
        }
        else{
            System.out.printf("NO
");
        }
        t--;
    }
}
}