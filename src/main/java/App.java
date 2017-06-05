import java.io.Console;

public class App{
  public static void main(String[] args){
    Console console = System.console();
    System.out.println("Enter the length of your rectangle");
    String stringLength = console.readLine();
    int intLength = Integer.parseInt(stringLength);

    System.out.println("Now enter the width of your rectangle");
    String stringWidth = console.readLine();
    int intWidth = Integer.parseInt(stringWidth);

    Rectangle userRectangle = new Rectangle(intLength, intWidth);

    boolean squareResult = userRectangle.isSquare();
    System.out.println("is your rectangle a square? " + squareResult + "!");
  }
}
