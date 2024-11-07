public class PrintSheepPattern {
    public static void main(String[] args) {
        System.out.println("’__’");
        for (int i = 2; i <= 6; i += 2) {
            System.out.println(i + " ( oo )");
            System.out.println("/= == == == =//");
            System.out.println((i + 2) + " / | | @@ | |");
            System.out.println("∗ | | - - - - −||");
            System.out.println((i + 4) + " VV VV");
        }
        System.out.println("’ ’ ’ ’");
    }
}