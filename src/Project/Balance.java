package Project;

public class Balance{
  private double currentPrice = 0;
  private double subTotal = 0;
  private double tips;
  private double tax;
// Unloads and adds the sum of the price array. Then finds the tax and tips values.
  public Balance(double[] balanceTracker){
    for(int i = 0; i < balanceTracker.length; i++){
      currentPrice = balanceTracker[i];
      subTotal = subTotal + currentPrice;
    }
    tax = subTotal * 0.13;
    tips = subTotal * 0.1;
  }
// Getter methods for tax, tips, and subtotal.
  public double getTax(){
    return tax;
  }
  public double getTips(){
    return tips;
  }
  public double getSubTotal(){
    return subTotal;
  }
}