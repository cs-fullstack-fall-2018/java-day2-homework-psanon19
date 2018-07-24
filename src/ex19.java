public class ex19 {

//    Exercise 19
//    Given a main function:
//
//    int number1 = 0;
//    int number2 = 0;
//    int number3 = 0;
//
//    sumOf3Numbers(number1, number2, number3);
//    Create a sumOf3Numbers function that will print out the sum of the three numbers

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;
        int number3 = 10;
        sumOf3Numbers(number1,number2,number3);

    }
    public static void sumOf3Numbers (int number1, int number2, int number3){
        int sum = number1+number2+number3;
        System.out.println(sum);
    }
}
