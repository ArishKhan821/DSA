/*



1             1
1 2         2 1 
1 2 3     3 2 1
1 2 3 4 4 3 2 1

*/

public class pattern08 {
    public static void main(String[] args) {
        int space = 6;
        for(int i=1;i<=4;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space = space - 2;
        }
        
    }
    
}
