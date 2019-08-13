import java.util.Scanner;
//this porgram helps user to create any multiplicaiton table till n number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number you want multiplication table for.");
        int number = scanner.nextInt();//storint user input
        System.out.println("To what value you would like to display?");
        int n = scanner.nextInt();//storing user input for n number of multiplication table


        for (int i = 0; i <= n; i++) {//iterating multiplication table starting from 0
            int total = number * i;//multiplying number with i
            System.out.println(number + " x " + i + " = " + total);


        }
    }
}





