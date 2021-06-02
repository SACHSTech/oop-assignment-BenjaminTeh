package Project;
import java.io.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) throws IOException{
    String restaurant = "";
    String section = "";
    String item = "";
    int check;
    int balanceLength;
    double balanceTracker[] = new double[10];
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Welcome to App Delivery Service!");
    System.out.println("Which restaurant would you like to order from: ");
    System.out.println(" - Bob's Burgers \n - Ina's Italian");
    restaurant = keyboard.readLine();
    System.out.println("Each order you create is limited to 10 items at a time.");
    
    for(balanceLength = 0; balanceLength < 10; balanceLength++){
    System.out.println("Are you done ordering? 0 = yes, 1 = no");
    check = Integer.parseInt(keyboard.readLine());
    if(check == 0){
      break;
    }
    System.out.println("Which section would you like to order from?");
    System.out.println(" - Appetizers \n - Main Courses \n - Desserts");
    section = keyboard.readLine();

    Order menu = new Order(restaurant, section);
    System.out.println("Select one of the following: ");
    System.out.println(menu.getOrders());
    item = keyboard.readLine();
    Item order = new Item(item);
    balanceTracker[balanceLength] = order.getPrice();
    }
    for(int j = 0; j < balanceLength; j++){
      System.out.println(balanceTracker[j]);
    }
    
  }
}