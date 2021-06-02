package Project;

public class Order extends Menu{
  private String orderOne;
  private String orderTwo;
  private String orderThree;
  private String name;
  private String section;
  public Order(String name, String sectionChoice){
    super(name);
    this.name = name;
    this.section = sectionChoice;
  }

  public void setSection(String sectionChoice){
    section = sectionChoice;
  }
  public String getOrders(){
    if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Appetizers")){
      orderOne = " - Fries";
      orderTwo = " - Spring Rolls";
      orderThree = " - Coleslaw";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Main Courses")){
      orderOne = " - Poutine";
      orderTwo = " - Beef Burgers";
      orderThree = " - Chicken Burgers";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Desserts")){
      orderOne = " - Ice Cream";
      orderTwo = " - Chocolate Ice Cream";
      orderThree = " - Strawberry Ice Cream";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Appetizers")){
      orderOne = " - Croutons";
      orderTwo = " - Caesar Salad";
      orderThree = " - Perogies";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Main Courses")){
      orderOne = " - Spaghetti";
      orderTwo = " - Veal Meal";
      orderThree = " - More Pasta";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Desserts")){
      orderOne = " - Gelato";
      orderTwo = " - Double Gelato";
      orderThree = " - Triple Gelato";
      return orderOne + "\n" + orderTwo + "\n" + orderThree;
    }
    else{
      return "You did not input the options properly!";
    }
  }

  
}