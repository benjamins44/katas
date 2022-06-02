package bco.guildedrose;

public class Dexterity extends Product {

  public Dexterity(final int sellIn, final int quality) {
    super("+5 Dexterity Vest", sellIn, quality);
  }

  @Override
  public void updateSellIn() {
    super.updateSellIn();
    if (sellIn < 0) {
      this.updateQuality();
    }
  }
}
