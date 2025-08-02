class pattern_11 {
    public static void main(String[] args) {
       int rows = 12;
       for (int i = 1; i <= rows; i++) {
            for (int j =1; j <= 6; j++) {
                if (i%2==1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
       }
      
    }
}

/*

Output: - 

* * * * * * 

* * * * * * 

* * * * * * 

* * * * * * 

* * * * * * 

* * * * * * 



*/
