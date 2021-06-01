package Project;

public class Menu{
  private String restaurant = "";

  public Menu(String menuChoice){
    restaurant = menuChoice;
  }
  public String getName(){
    return restaurant;
  }
  public String toString(){
    return "You have chosen " + restaurant + ". Which section would you like to order from?";
  }
  
  
}