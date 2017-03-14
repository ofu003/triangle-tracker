import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    boolean programRunning = true;

    while (programRunning) {

    System.out.println("Determine what type of triangle you have. Enter Side 1:");
    int userSide1 = Integer.parseInt(console.readLine());
    System.out.println("Enter Side 2:");
    int userSide2 = Integer.parseInt(console.readLine());
    System.out.println("Enter Side 3:");
    int userSide3 = Integer.parseInt(console.readLine());

    Triangle userTriangle= new Triangle(userSide1, userSide2, userSide3);

    if (userSide1 > userSide2 + userSide3 || userSide2 > userSide1 + userSide3 || userSide3 > userSide1 + userSide2) {
      System.out.println("This is not a valid triangle.");
    } else if (userSide1 == userSide2 && userSide1 == userSide3) {
      System.out.println("This is an equilateral triangle.");
    } else if (userSide1 != userSide2 && userSide1 != userSide3 && userSide2 != userSide3) {
      System.out.println("This is a scalene triangle.");
    } else {
      System.out.println("This is an isosceles triangle.");
    }

    System.out.println("To continute, enter Continue. To exit, enter Exit.");
    String userResponse = console.readLine();
    if (userResponse.equals("Continue")) {
      programRunning = true;
    } else {
      programRunning = false;
    }
  }
  }
}
