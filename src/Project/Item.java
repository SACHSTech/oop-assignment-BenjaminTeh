package Project;

public class Item{
  private double price;
  private String name;

  public Item(String theName){
    name = theName;
  }
// Double containing the actual price values for each menu order.
  public double getPrice(){
    if(name.equalsIgnoreCase("Fries")){
      price = 3.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Spring Rolls")){
      price = 3.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Poutine")){
      price = 5.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Burger")){
      price = 4.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Vanilla Ice Cream")){
      price = 1.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Chocolate Ice Cream")){
      price = 1.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Perogies")){
      price = 4.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Caesar Salad")){
      price = 2.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Spaghetti")){
      price = 6.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Veal Meal")){
      price = 8.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Gelato")){
      price = 2.99;
      return price;
    }
    else if(name.equalsIgnoreCase("Double Gelato")){
      price = 3.99;
      return price;
    }
// In case of misinput, do not charge customer.
    else{
      return 0;
    }
  }
  
}