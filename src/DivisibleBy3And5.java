public class DivisibleBy3And5 {//this  is the program to find out number that are divisible by 3 and 5 seperately
    public static void main(String args[]) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)//only numbers divided by 3 between 10-100 will be printed
                System.out.println(i + " is divisible by 3. ");
        }

        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0)//only numbers  divided by 5 between 10-100 will be printed
                System.out.println(i + " is divisible by 5. ");
        }

    }
}

