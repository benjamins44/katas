package bco.guildedrose;

public class AgedBrie extends Product {

  public AgedBrie(final int sellIn, final int quality) {
    super("Aged Brie", sellIn, quality);
  }

  @Override
  public void updateQuality() {
    this.incrementQuality();
    if (sellIn < 0) {
      this.incrementQuality();
    }
  }

  private void incrementQuality() {
    if (quality < 50) {
      this.quality++;
    }
  }
}
