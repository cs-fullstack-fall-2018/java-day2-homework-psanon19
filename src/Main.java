public class Main {
//    Exercise 17
//    Given a main function:
//
//    printNumbers();
//    Create a printNumbers function to print integers from -25 to 20

    public static void main(String[] args) {
        printNumber();

    }

    public static void printNumber() {
        int counter = -25;
        while (counter <= 20) {
            System.out.println(counter);
            counter++;
        }
    }
}