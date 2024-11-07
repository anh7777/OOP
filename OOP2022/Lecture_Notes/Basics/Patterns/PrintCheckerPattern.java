public class PrintCheckerPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if ( i % 2 == 0 ) {
                row_Print(5);
            } else {
                System.out.print(" ");
                row_Print(5);
            }
        }
    } 
    
    public static void row_Print(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}
