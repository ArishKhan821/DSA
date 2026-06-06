/*
A B C D E 
A B C D
A B C
A B
A

*/

public class pattern11 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char ch ='A';ch<='A'+(5-i);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        
    }
    
}
