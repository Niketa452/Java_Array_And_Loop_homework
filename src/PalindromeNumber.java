import java.util.Scanner;
//this program helps user to establish whether a particular is a Palindrome number or not.
public class PalindromeNumber {

    public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number to check whether it is a Palindrome number or not.");
    int num = scanner.nextInt();
    int reverse = 0;
    int remainder = 0;
    int temp =num;
    while (temp != 0) {
        remainder = temp % 10;//for eg number is 54 (remainder = 54/10=5.4,rem =4
        reverse = reverse * 10 + remainder;// rev=0*10+(rem=4) = 4
        temp = temp / 10; // num = (54-4=50) 50/10=5
        // remainder = num % 10; 5
        // reverse = reverse *10 + remainder= (4*10+5=45) number reversed
    }
    if (reverse==num){
        System.out.println("This is a Palindrome  number.");
    }
else{
        System.out.println("This is not a Palindrome number.");
    }



    }


}
