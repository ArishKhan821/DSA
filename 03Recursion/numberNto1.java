// printing number from 1 to n
import java.util.Scanner;

public class numberNto1 {
    static void numbers(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        numbers(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        numbers(m,m);
    }
    
}
