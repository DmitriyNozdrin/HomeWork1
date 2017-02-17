

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Сравнение паролей
/* String password = "A1234";

Scanner scan = new Scanner (System.in);
System.out.println("Type your password");
String password_new = scan.next();

scan.close();
if (password.equals(password_new))
System.out.println("Password is valid");
else System.out.println("Invaid Password");

*/

        Scanner scan = new Scanner(System.in);
        Scanner count = new Scanner(System.in);

        System.out.println("How many digits you are going to input:");
        int dig = count.nextInt();
        System.out.println("Enter " + dig + " digits and click on Enter button:");
        int inp[] = new int[dig];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = scan.nextInt();
        }
        scan.close();
        count.close();

        System.out.println("You entered: " + Arrays.toString(inp));

        chetnie(inp);
        nechet(inp);
        devide3(inp);
        devide5(inp);
        max(inp);
    }

    private static void devide3(int[] inp) {
        System.out.println("Числа делящиеся на 3 ли на 9: ");
        for (int i = 0; i < inp.length; i++) {
            if (inp[i] % 3 == 0 || inp[i] % 9 == 0)
                System.out.print(inp[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void devide5(int[] inp) {
        System.out.println("Числа делящиеся на 5 и 7: ");
        for (int i = 0; i < inp.length; i++) {
            if (inp[i] % 5 == 0 && inp[i] % 7 == 0)
                System.out.print(inp[i] + " ");
        }
        System.out.println();
    }

    private static void max(int[] inp) {
        int max = inp[0];
        for (int i = 0; i < inp.length - 1; i++) {

            max = inp[i];
            if (inp[i] < inp[i + 1]) {
                max = inp[i + 1];
            }
        }

        System.out.println("Max vaue is :" + max);

    }

    private static void nechet(int[] inp) {
        System.out.println("Нечетные числа");

        for (int i = 0; i <= inp.length - 1; i++) {
            if (inp[i] % 2 == 0) continue;
            {
                System.out.print(inp[i] + " ");
            }
        }
        System.out.println();
    }


    private static void chetnie(int[] inp) {
        System.out.println("Четные числа");

        for (int i = 0; i <= inp.length - 1; i++) {
            if (inp[i] % 2 == 0) {
                System.out.print(inp[i] + " ");
            }
        }
        System.out.println();

    }

}


/**
 * part b
 */

/*package com.company;

        import java.util.Arrays;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner count = new Scanner(System.in);

        System.out.println("Scolko znacheniy");
        int dig = count.nextInt();
        System.out.println("VEnter data");

        String arr[] = new String[dig];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count.next();

        }

        System.out.println("Entered data " + Arrays.toString(arr));

        count.close();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() == 3) {
                if (arr[i].charAt(1) != arr[i].charAt(2)) {
                    System.out.println("Original triple digits " + arr[i]);
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() % 2 == 0) {
                int val1 = 0;
                int val2 = 0;

                for (int j = 0; j < arr[i].length(); j++) {


                    if (j < arr[i].length() / 2) {
                        val1 += (int) arr[i].charAt(j);
                    } else {

                        val2 += (int) arr[i].charAt(j);
                    }
                }
                if (val1 == val2) {
                    System.out.println("Lcuck Digits = " + arr[i]);
                }
            }

        }
    }

}*/
