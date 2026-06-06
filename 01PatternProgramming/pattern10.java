/*
A
A B
A B C
A B C D
A B C D E
*/

public class pattern10 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char ch='A';ch<='A'+i-1;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
