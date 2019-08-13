import java.util.Scanner;
//this program is to create a right angle triangle with @.
public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for rows");
        int rows = scanner.nextInt();//initialising a variable to store number of rows for the triangle
        for (int i = 1; i <= rows; i++) {//loop for rows
            for (int j = 1; j <= i; j++)//index of columns gets less every iteration to create a triangle shape
                System.out.print('@');

            {
                System.out.println("");


            }
        }
    }
}