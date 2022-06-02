package bco.guildedrose;

public class Product extends Item {

  public Product(final String name, final int sellIn, final int quality) {
    super(name, sellIn, quality);
  }

  public boolean hasName(final String nameToCompare) {
    return this.name.equals(nameToCompare);
  }

  public void updateQuality() {
    if (quality > 0) {
      this.quality--;
    }
  }

  public void updateSellIn() {
    this.sellIn--;
  }

  public void nextDay() {
    this.updateSellIn();
    this.updateQuality();
  }
}
