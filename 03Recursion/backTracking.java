import java.util.Scanner;
public class backTracking {
    static void numbers(int i,int n){
        if(i>n){
            return;
        }
        numbers(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        numbers(1,m);

    }
    
}
