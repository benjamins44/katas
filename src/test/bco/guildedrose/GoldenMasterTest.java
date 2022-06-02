package bco.guildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class GoldenMasterTest {

  @Test
  void goldenMaster() {
    final StringBuffer result = new StringBuffer();
    result.append("OMGHAI!");

    final Product[] items = new Product[]{
        new Dexterity(10, 20), //
        new AgedBrie(2, 0), //
        new Elixir(5, 7), //
        new Sulfura(0, 80), //
        new Sulfura(-1, 80),
        new BackstagePasses(15, 20),
        new BackstagePasses(10, 49),
        new BackstagePasses(5, 49),
        // this conjured item does not work properly yet
        new ConjuredManaCake(3, 6)};

    final GildedRose app = new GildedRose(items);

    final int days = 10;

    for (int i = 0; i < days; i++) {
      result.append("-------- day ").append(i).append(" --------");
      result.append("name, sellIn, quality");
      for (final Product item : items) {
        result.append(item);
      }
      app.updateQuality();
    }

    Approvals.verify(result);
  }
}
