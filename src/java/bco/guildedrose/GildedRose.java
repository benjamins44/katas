package bco.guildedrose;

public class GildedRose {

  Product[] products;

  public GildedRose(final Product[] products) {
    this.products = products;
  }

  public void updateQuality() {
    for (final Product product : products) {
      product.nextDay();
    }
  }
}
