package Project;

public class Menu{
  private String choice = "";

  public Menu(String menuChoice){
    choice = menuChoice;
  }

  public String toString(){
    return "You have chosen " + choice + ". Which section would you like to order from?";
  }
  
  
}