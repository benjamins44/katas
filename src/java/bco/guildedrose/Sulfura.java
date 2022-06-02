package bco.guildedrose;

public class Sulfura extends Product {

  public Sulfura(final int sellIn, final int quality) {
    super("Sulfuras, Hand of Ragnaros", sellIn, quality);
  }

  @Override
  public void updateQuality() {
    // Do nothing
  }

  @Override
  public void updateSellIn() {
    // Do nothing
  }
}
