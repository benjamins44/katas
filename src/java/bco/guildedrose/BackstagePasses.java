package bco.guildedrose;

public class BackstagePasses extends Product {

  public BackstagePasses(final int sellIn, final int quality) {
    super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
  }

  @Override
  public void updateQuality() {
    this.incrementQuality();
    if (sellIn > 5 && sellIn < 11) {
      this.incrementQuality();
    }
  }

  private void incrementQuality() {
    if (quality < 50) {
      this.quality++;
    }
  }

  @Override
  public void updateSellIn() {
    super.updateSellIn();
    if (sellIn < 0) {
      quality = 0;
    }
  }

  @Override
  public void nextDay() {
    this.updateQuality();
    this.updateSellIn();
  }
}
