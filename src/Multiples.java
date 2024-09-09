public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 3; i < 1000 ; i++) {
            boolean DividedBy3 = i % 3 == 0;
            boolean DividedBy5 = i % 5 == 0;
            if (DividedBy3 || DividedBy5) {
                counter++;
            }
        }     System.out.println(counter);
    }
}
