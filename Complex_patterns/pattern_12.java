class pattern_12 {
    public static void main(String[] args) {
       int rows = 4;
       int count = 10;
       for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(count + " ");
            count--;
         }
         System.out.println();
       }
      
    }
}

/*
 
 
Output:- 

10 
9 8 
7 6 5 
4 3 2 1 

*/