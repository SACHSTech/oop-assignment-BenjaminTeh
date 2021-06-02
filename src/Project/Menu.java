package Project;

public abstract class Menu{
  private String restaurant = "";

  public Menu(String menuChoice){
    restaurant = menuChoice;
  }
  public String getName(){
    return restaurant;
  }

  
  public abstract String getOrders();
}
