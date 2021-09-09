import java.util.Scanner;

public class MethodsPractice {

    //TODO: Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.

    public static char firstChar(String string) {
        return string.charAt(0);
    }

    //TODO: Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.

    public static char secondChar(String string) {
        return string.charAt(1);
    }

    //TODO: Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.

    public static char lastChar(String string) {
        return string.charAt(string.length() - 1);
    }

    //TODO: Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.

    public static char secondToLastChar(String string) {
        return string.charAt(string.length() -2);
    }

    //TODO: Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".

    public static boolean userWantsToContinue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to continue?");
        String userResponse = sc.next();
        return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
    }

    //TODO: Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.

    public static boolean isEven(int x){
        return x % 2 == 0;
    }

    //TODO: Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.

    public static boolean isOdd(int x) { return x % 2 != 0; }

    //TODO: Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.

    public static int countOdds(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i += 1) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

//        System.out.println(firstChar("carlos"));
//        System.out.println(secondChar("carlos"));
//        System.out.println(lastChar("carlos"));
//        System.out.println(secondToLastChar("carlos"));
//
//        System.out.println(userWantsToContinue());

//        System.out.println(isEven(3));
//        System.out.println(isEven(4));

//        System.out.println(isOdd(4));
//        System.out.println(isOdd(3));

        System.out.println(countOdds(1, 10));

    }
}
