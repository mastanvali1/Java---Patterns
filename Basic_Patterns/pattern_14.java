class pattern_14{
     public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {

            for (int j = 2; j <= i; j++) {
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
---------------------------------------
Output:-

*
_**
__***
___****
____****


Note:  "_" is the space , for better understanding i have written "_".

--------------------------------------------------

Original Output :- 

*
 **
  ***
   ****
    *****

-----------------------------------------------
*/