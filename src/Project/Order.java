package Project;

public class Order extends Menu{
  private String orderOne;
  private String orderTwo;
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
      orderOne = " - Fries (3.99)";
      orderTwo = " - Spring Rolls (3.99)";
      return orderOne + "\n" + orderTwo;
    }
    else if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Main Courses")){
      orderOne = " - Poutine (5.99)";
      orderTwo = " - Beef Burger (4.99)";
      return orderOne + "\n" + orderTwo;
    }
    else if(name.equalsIgnoreCase("Bob's Burgers") && section.equalsIgnoreCase("Desserts")){
      orderOne = " - Ice Cream (1.99)";
      orderTwo = " - Chocolate Ice Cream (1.99)";
      return orderOne + "\n" + orderTwo;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Appetizers")){
      orderOne = " - Perogies (4.99)";
      orderTwo = " - Caesar Salad (2.99)";
      return orderOne + "\n" + orderTwo;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Main Courses")){
      orderOne = " - Spaghetti (6.99)";
      orderTwo = " - Veal Meal (8.99)";
      return orderOne + "\n" + orderTwo;
    }
    else if(name.equalsIgnoreCase("Ina's Italian") && section.equalsIgnoreCase("Desserts")){
      orderOne = " - Gelato (2.99)";
      orderTwo = " - Double Gelato (3.99)";
      return orderOne + "\n" + orderTwo;
    }
    else{
      return "You did not input the options properly!";
    }
  }

  
}