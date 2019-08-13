import java.sql.SQLOutput;
import java.util.Scanner;
// this is a program which enables an user to insert a value into a specific array position
public class InsertElement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];//array length
        System.out.println("Enter a value to be inserted in the array: ");
        int b = scanner.nextInt();//int b stores user input
        System.out.println("Enter a position number between range between 0-4: ");
        int c = scanner.nextInt();//int c stores user input for position
        boolean ans = false;//initialising boolean condition for position of value inserted.
        for (int i = 0; i <= a.length; i++) {
            if (c == i) {//condition to check index should not be greater than 4 and less than 0
                ans = true;
                System.out.println("The number " + b + " is inserted in the " + c + " position. ");
            }

            }
        }
    }
