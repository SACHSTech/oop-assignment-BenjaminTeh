package Project;
import java.io.*;
import java.util.Arrays;
import java.text.*;

public class Main{
  public static void main(String[] args) throws IOException{
    String restaurant = "";
    String section = "";
    String item = "";
    String getTips = "";
    double finalTotal = 0;
    int check;
    int balanceLength;
    double[] balanceTracker = new double[10];
    String[] orderTracker = new String[10];
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,###.00");

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
    orderTracker[balanceLength] = item;
    }

    for(int j = 0; j < balanceLength; j++){
      System.out.println(orderTracker[j] + " - " + balanceTracker[j]);
    }

    System.out.println("-------------------");

    Balance receipt = new Balance(balanceTracker);
    System.out.println("Subtotal: " + receipt.getSubTotal());
    System.out.println("Taxes: " + numberFormat.format(receipt.getTax()));
    System.out.println("Would you like to give tips? Type y to confirm");
    getTips = keyboard.readLine();

    if(getTips.equalsIgnoreCase("y")){
      System.out.println("Tips: " + numberFormat.format(receipt.getTips()));
      finalTotal = receipt.getSubTotal() + receipt.getTax() + receipt.getTips();
    }
    else{
      finalTotal = receipt.getSubTotal() + receipt.getTax();
    }

    System.out.println("Total: " + numberFormat.format(finalTotal));
    
  }
}