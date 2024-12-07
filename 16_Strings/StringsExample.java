import java.util.*;

public class StringsExample {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c' ,'d'};
        String str1 = "abcd";
        String str2 = new String("xyz@#1234");

        //Strings are IMMUTABLE (it means it cannot be changed at a later time.)

        Scanner sc = new Scanner(System.in);

//        String name , name1;
//        name = sc.next(); //will only take one word as input not the complete line if we use space and etc.
//        System.out.println(name);
//        name1 = sc.nextLine();
//        System.out.println(name1);

        //length
//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        //concatenation
        String firstName = "Aditya";
        String lastName = "Methe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is this!");
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
