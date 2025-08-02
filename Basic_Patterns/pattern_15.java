class pattern_15{
     public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            
           for (int k = 1; k <= i; k++){
            System.out.print("*");
           }
            System.out.println();
        }
    }

}

/*
--------------------------------
Output:-

____*
___**
__***
_****
*****

Note:-   "_" means its is space , for better understanding purpose i have used this.

---------------------------------
Original Output:-

    *
   **
  ***
 ****
*****

-----------------------------------

*/