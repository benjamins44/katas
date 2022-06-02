package bco.guildedrose;

public class ConjuredManaCake extends Product {

  public ConjuredManaCake(final int sellIn, final int quality) {
    super("Conjured Mana Cake", sellIn, quality);
  }

  @Override
  public void updateQuality() {
    super.updateQuality();
    super.updateQuality();
  }

  @Override
  public void updateSellIn() {
    super.updateSellIn();
    if (sellIn < 0) {
      this.updateQuality();
    }
  }
}
