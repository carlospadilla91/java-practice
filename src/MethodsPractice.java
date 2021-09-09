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
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    //TODO: Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.

    public static int countEvens(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i += 1) {
            if (isOdd(i)) {
                count++;
            }
        }
        return count;
    }

    //TODO: Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y"

    public static boolean isVowel(String vowel) {
        String vowelList = "aeiouAEIOU";
        return vowelList.contains(vowel);
    }

    //TODO: Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.

    public static boolean hasVowels(String str) {
        String vowelList = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == vowelList.charAt(i))
                return true;
        }
        return false;
    }

    //TODO: Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    //TODO: Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.

    public static boolean isPrime(int x) {

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

//        System.out.println(countOdds(1, 10));
//        System.out.println(countEvens(1, 10));

//        System.out.println(isVowel("a"));
//        System.out.println(isVowel("e"));
//        System.out.println(isVowel("t"));
//        System.out.println(isVowel("y"));

//        System.out.println(hasVowels("carlos"));
//        System.out.println(hasVowels("bbb"));

        System.out.println(countVowels("carlos"));
        System.out.println(countVowels("ttt"));
    }
}
