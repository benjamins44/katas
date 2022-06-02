package bco.guildedrose;

public class Elixir extends Product {

  public Elixir(final int sellIn, final int quality) {
    super("Elixir of the Mongoose", sellIn, quality);
  }

  @Override
  public void updateSellIn() {
    super.updateSellIn();
    if (sellIn < 0) {
      this.updateQuality();
    }
  }
}
