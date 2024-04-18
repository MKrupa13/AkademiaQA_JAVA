public class FirstHomework {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 45;
        int d = 9;

        if (a % b == 0) {
            System.out.println("Jest parzysta");
        } else {
            System.out.println("Jest nieparzysta");
        }

        if (c % d == 0) {
            System.out.println("Jest parzysta");
        } else {
            System.out.println("Jest nieparzysta");
        }
        int resultOne = a + b;
        int resultTwo = c + d;

        if (resultOne % 2 == 0 && resultTwo % 2 == 0) {
            System.out.println("Są parzyste");

        } else {
            System.out.println("Nieparzyste");
        }
    }
}
