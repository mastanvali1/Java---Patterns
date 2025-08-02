class pattern_5{
    public static void main(String[] args) {
        int n = 5; //no of rows
            for (int i = 1; i <= 5; i++) {
                
                for (int j = 2; j<=i; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2*(n+1-i)-1; j++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }

            for(int i = 2; i <= 5; i++) {
                for(int j = 4; j >= i; j-- ) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2*i)-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }   
    }
}

/* 
---> another logic for below output

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/