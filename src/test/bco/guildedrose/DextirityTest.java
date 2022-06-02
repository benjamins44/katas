package bco.guildedrose;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DextirityTest {

  final int quality = 20;

  @Test
  void updateSellIn_discrease_quality_when_sellIn_less_0() {
    final Product product = new Dexterity(0, quality);

    product.updateSellIn();

    Assertions.assertThat(product.quality).isEqualTo(quality - 1);
  }
}
