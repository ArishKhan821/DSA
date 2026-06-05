/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

public class pattern07{
    public static void main(String[] args) {
        int start ;
        for(int i=0;i<5;i++){
            if(i%2==0){
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j=0;j<i+1;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

}