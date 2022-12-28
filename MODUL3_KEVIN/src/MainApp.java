import java.util.*;
import java.util.InputMismatchException;

public class MainApp {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation cal = new Calculation();

        do {
            try {
System.out.println("""
WELCOME TO OUR CALCULATION PROGRAMM

==== Menu Program ====

1. Square
2. Circle
3. Trapezoid
0. Exit
        """);

System.out.print("Select Menu : ");

int opsi = input.nextInt();

                switch (opsi) {
                    case 1:
                        System.out.print("Enter the length of the side of the square : ");
                        double side = input.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println("\nThe calculation result : "+cal.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double r = input.nextDouble();
                        cal.setCircle(r);
                        cal.run();
                        System.out.println("\nThe calculation result : "+cal.getCircle());
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of trapezoid : ");
                        double a = input.nextDouble();

                        System.out.print("Enter the upperside of trapezoid : ");
                        double b = input.nextDouble();

                        System.out.print("Enter the height trapezoid : ");
                        double t = input.nextDouble();

                        cal.setTrapezoid(a, b, t);
                        cal.run();
                        System.out.println("\nThe calculation result : "+cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program Ended");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Opsi tidak tersedia");
                        continue;
                }
            } 
            catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

            catch (InputMismatchException e){
                System.out.println("===== Input Must Be a Number =====");
                break;
            }
        } 
        while (repeat);
        input.close();
    }
}
