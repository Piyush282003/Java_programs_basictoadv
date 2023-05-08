package ArraysPrac;

import java.util.Scanner;

public class J03_Character_tolowerorupper {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s1 = obj.nextLine();

//        string ko char array me convert..
        char[] chArr = s1.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            if (i % 2 != 0) {
                chArr[i] = Character.toUpperCase(chArr[i]);
            } else {
                chArr[i] = Character.toLowerCase(chArr[i]);
            }
        }

//        char array ko string me convert..
        String s2 = new String(chArr);

        System.out.println("New String = " + s2);
    }
}
