class pattern_23{
     public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {

            for(int j = 1; j<=i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
        ch = 'C';
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(ch);
            }
            System.out.println();
            ch--;
        }
        
    }

}

/*

Output:-

A
BB
CCC
DDDD
CCC
BB
A

*/