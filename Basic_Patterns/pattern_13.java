class pattern_13{
     public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int k = 1; k <= 4; k++) {
                System.out.print(i);
            }

            for (int l = 5; l >= i; l--){
                System.out.print("@");
            }
           
            System.out.println();
        }
    }

}


/*
------------------------
Output:-

*1111@@@@@
**2222@@@@
***3333@@@
****4444@@
*****5555@


-------------------------
*/