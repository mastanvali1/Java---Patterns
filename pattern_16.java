class pattern_16{
     public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }

}

/*
-----------------------
Output :- 

____*_
___*_*_
__*_*_*_
_*_*_*_*_
*_*_*_*_*_


Note: "_" is space , for better understanding i have used it.
------------------------

Original output :- 

    * 
   * * 
  * * * 
 * * * * 
* * * * * 

--------------------------------
*/
