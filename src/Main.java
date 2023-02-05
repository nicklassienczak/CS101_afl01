
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        methodOne();
        method2Max(1, 18, 8);
        method2Min(1, 18, -8);
        method3(2);
        method4();
        */
        Car bimmer = new Car("BMW X3", 699999.99);
            System.out.println(bimmer);
        bimmer.start();

        Driver nicklas = new Driver("Nicklas", 24);
            System.out.println(nicklas);
        nicklas.drive();

        Employee coderNick = new Employee("Nicklas", "Knudsen", 50000);
            System.out.println(coderNick);

        Employee coderDude = new Employee("Chad", "Chadsen", -10000);
            System.out.println(coderDude);

        coderNick.salaryIncrease(10);
        coderDude.salaryIncrease(10);



    }

    public static void methodOne() {

        //Implement scanner, name the variable "in"
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("You are not eligible to vote");
        }
        else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void method2Max(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > a && b > c) {
            System.out.println(b);
        }
        else if (c > a && c > b) {
            System.out.println(c);
        }
    }


    public static void method2Min(int aa, int bb, int cc) {

        if (aa >= bb || aa >= cc) {
            if (bb < aa && bb < cc) {
                System.out.println(bb);
            }
            else if (cc < aa && cc < bb) {
                System.out.println(cc);
            }
        } else {
            System.out.println(aa);
        }
    }

    public static void method3(int x) {
        /* To enable the scanner, remove the argument, parameter and comment symbols.

        Scanner numbIn = new Scanner(System.in);
        System.out.println("Enter your number here");
        int x = numbIn.nextInt();
         */

        if (x % 2 == 0) {
            System.out.println(x + " is an even number");
        }
        else {
            System.out.println(x + " is an odd number");
        }
    }

    public static void method4() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String fullName = input.nextLine();

        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0].substring(0, 1);
        String middleName = nameParts[1].substring(0, 1);
        String lastName = nameParts[2];

        System.out.println("Hello " + firstName + ". " + middleName + ". " + lastName);

    }
}
