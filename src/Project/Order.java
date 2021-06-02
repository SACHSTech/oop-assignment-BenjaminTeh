package Project;

public class Order extends Menu{
  private String orderOne = "";
  private String orderTwo;
  private String orderThree;
  private String name;
  private String section;
  public Order(String name, String sectionChoice){
    super(name);
    this.name = name;
    this.section = sectionChoice;
  }
  public void setName(String name){
    name = name;
  }
  public void setSection(String sectionChoice){
    section = sectionChoice;
  }
  public String getOrders(){
    if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Appetizers")){
      orderOne = "PoggersFM";
      return orderOne;
    }
    else{
      return null;
    }
  }
  public String toString(){
    return orderOne;
  }
  
}