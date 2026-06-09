import java.util.Scanner;

public class number1toN {
    static int numbers(int i,int n){
       if(i>n){
        return 0;
       }
       System.out.println(i);
       return numbers(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        numbers(1,m);
    }
    
}
