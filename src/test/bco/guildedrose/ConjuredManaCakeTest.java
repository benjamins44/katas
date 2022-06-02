package bco.guildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConjuredManaCakeTest {

  final int quality = 20;
  final int sellIn = 20;

  @Test
  void updateQuality_discrease_quality_with_2_points() {
    final Product product = new ConjuredManaCake(sellIn, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality - 2);
  }
}
