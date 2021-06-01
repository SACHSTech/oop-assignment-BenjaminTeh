package Project;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    String restaurant = "";
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Welcome to App Delivery Service!");
    System.out.println("Which restaurant would you like to order from: ");
    System.out.println(" - Bob's Burgers \n - Ina's Italian");
    restaurant = keyboard.readLine();
    System.out.println(restaurant);
  }
}