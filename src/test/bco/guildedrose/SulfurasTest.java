package bco.guildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SulfurasTest {

  final int sellIn = 20;
  final int quality = 20;

  @Test
  void updateQuality_never_change_quantity() {
    final Product product = new Sulfura(sellIn, quality);

    product.updateQuality();

    assertThat(product.quality).isEqualTo(quality);
  }

  @Test
  void updateSellin_never_change_sellIn() {
    final Product product = new Sulfura(sellIn, quality);

    product.updateSellIn();

    assertThat(product.sellIn).isEqualTo(sellIn);
  }
}
