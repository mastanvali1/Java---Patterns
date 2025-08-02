class pattern_21{
     public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for(int j = 1; j<=5; j++) {

                if(i== 1 || i == 5 || j == 1 || j == 5){
                     System.out.print("*"); 
                }
                else{
                    System.out.print(" ");
                }
            }
                
            System.out.println();
        }
        
    }

}
/*

Output:-

*****
*   *
*   *
*   *
*****


------------------------

     12345
   1 *****
   2 *___*
   3 *___*
   4 *___*
   5 *****

Note:- if i == 1 || i== 5 || j == 1 || j == 5 we are printing the stars(*) , 
remaining spaces will be done with the help of else condition just printing ' s.o.p(" "); '  that all. 

*/
