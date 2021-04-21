import java.math.BigDecimal;
public class Basket {
  private SaleItem[] items;
  private int maxSize;
  private BigDecimal totalCost;

  public Basket(int basketSize) {
    this.maxSize = basketSize;
    this.items = new SaleItem[0];
    this.totalCost = new BigDecimal(0);
  }

  public void add(SaleItem newItem) {
    if(this.items.length < maxSize) {
      SaleItem[] newArr = new SaleItem[this.items.length+1];
      for(int i = 0; i < this.items.length;i++) {
        newArr[i] = this.items[i] ;
      }
      newArr[this.items.length] = newItem;
      this.items = newArr;
    }
  }

  public SaleItem[] getItems() {
    return this.items;
  }

  public int getBasketSize() {
    return this.maxSize;
  }

  public BigDecimal getTotalCost() {
    this.totalCost = new BigDecimal(0);
    for(int i = 0; i < this.items.length; i++) {
      this.totalCost = this.totalCost.add(this.items[i].getCost());
    }
    return this.totalCost;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < this.items.length; i++) {
      sb.append(this.items[i].getName() + '\n');
    }
    return sb.toString();
  }
}