package Project;
import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    String restaurant = "";
    String section = "";
    String item = "";
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Welcome to App Delivery Service!");
    System.out.println("Which restaurant would you like to order from: ");
    System.out.println(" - Bob's Burgers \n - Ina's Italian");
    restaurant = keyboard.readLine();
    
    System.out.println("You have chosen " + restaurant + ". Which section would you like to order from?");
    System.out.println(" - Appetizers \n - Main Courses \n - Desserts");
    section = keyboard.readLine();

    Order menu = new Order(restaurant, section);
    System.out.println("Select one of the following: ");
    System.out.println(menu.getOrders());
    item = keyboard.readLine();
    
  }
}