import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = keyboard.nextInt();
    int currentYear = 2020;
    int birthYear = currentYear - age;
    System.out.println("You were born in " + birthYear);
  }
}
