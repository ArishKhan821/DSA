// printing name n times
import java.util.Scanner;

public class nTimes {
    static void name(int i,int n,String a){
        if(i>n){
            return;
        }
        System.out.println(a);
         name(i+1,n,a);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            name(1,m,b);
        }

    
}
