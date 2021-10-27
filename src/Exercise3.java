import java.util.Scanner;

public class Exercise3 {
    public static void findBuzz() {
        System.out.println("Enter a digit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int i = in.nextInt();
            if (i <= 0 || i > 100)
                System.out.println("enter a digt from 1 to 100");
            else
                toBuzz(i);
        }

        in.close();
    }


    public static void toBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            System.out.println("FizzBuzz");
        else if (i % 3 == 0)
            System.out.println("Fizz");
        else if (i % 5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(i);

    }

    public static void main(String[] args) {
        findBuzz();
    }
}
