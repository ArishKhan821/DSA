import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revN = 0;
        int original = n;
        while(n>0){
            int lastdigit = n%10;
            revN = (revN*10)+lastdigit;
            n = n/10;

        }
        if(original==revN){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
