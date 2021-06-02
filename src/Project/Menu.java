package Project;

public abstract class Menu{
// Abstract class that creates a new object when the restaurant is chosen. Doesn't have any functionality, but Order.java is an extension of it.
  private String restaurant = "";

  public Menu(String menuChoice){
    restaurant = menuChoice;
  }
  public String getName(){
    return restaurant;
  }
  
  public abstract String getOrders();
}
