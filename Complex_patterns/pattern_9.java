class pattern_9 {
    public static void main(String[] args) {
       int rows = 4;
       int colms = 5; 
       for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= colms; j++) {
            if(i==1 || i == rows || j == 1 || j == colms) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}

/*


Output:

*****
*   *
*   *
*****

*/