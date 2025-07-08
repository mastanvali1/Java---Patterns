class pattern_20{
     public static void main(String[] args) {
       for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }

}

/*

Output:-

_____*****
____*****
___*****
__*****
_*****
__*****
___*****
____*****
_____*****


Note:- "_" this is also space ,for better understanding i have taken. 

Original Output:-


     *****
    *****
   *****
  *****
 *****
  *****
   *****
    *****
     *****



*/