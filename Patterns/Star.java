public class Star {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) { // outer loop
            for (int star = 1; star <= line; star++) { // inner loop
                System.out.print(" * ");

            }
            System.out.println(); // move to next line after printing stars
        }
    }
}
