package shoppingBasket;
import java.math.BigDecimal;
public class SaleItem {
  private String name;
  private BigDecimal cost;

  public SaleItem(String name, BigDecimal cost) {
    this.name = name;
    this.cost = cost;
  }

  public String getName() {
    return this.name;
  }

  public BigDecimal getCost() {
    return this.cost;
  }
}