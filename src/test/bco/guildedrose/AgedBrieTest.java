package bco.guildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AgedBrieTest {

  final int sellIn = 20;
  final int quality = 20;

  @Test
  void updateQuality_increment_quality_with_one_quantity() {
    final Product product = new AgedBrie(sellIn, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality + 1);
  }

  @Test
  void updateQuality_increment_quality_with_two_quantity_when_sellIn_less_0() {
    final Product product = new AgedBrie(-1, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality + 2);
  }

  @Test
  void updateQuality_can_not_update_quality_more_than_50() {
    final Product product = new AgedBrie(sellIn, 50);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(50);
  }
}
