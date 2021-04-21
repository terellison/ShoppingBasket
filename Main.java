import java.math.BigDecimal;
class Main {
  public static void main(String args[]) {
    Basket testBasket = new Basket(10);

    for(int i = 0; i < testBasket.getBasketSize(); i++) {
      testBasket.add(new SaleItem("Item number " + Integer.toString(i),new BigDecimal(i)));
    }
    System.out.println("Items in basket:\n" + testBasket.toString() + "\nTotal cost: " + testBasket.getTotalCost().toString());
  }
}
