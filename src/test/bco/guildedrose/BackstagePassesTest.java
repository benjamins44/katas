package bco.guildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BackstagePassesTest {

  final int sellIn = 20;
  final int quality = 20;

  @Test
  void updateQuality_increment_quality_with_one_quantity() {
    final Product product = new BackstagePasses(sellIn, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality + 1);
  }

  @Test
  void updateQuality_can_not_update_quality_more_than_80() {
    final Product product = new BackstagePasses(sellIn, 80);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(80);
  }

  @Test
  void updateQuality_increment_quality_with_two_quantity_when_sellIn_less_11() {
    final Product product = new BackstagePasses(6, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality + 2);
  }

  @Test
  void updateQuality_increment_quality_with_two_quantity_when_sellIn_more_5() {
    final Product product = new BackstagePasses(10, quality);

    product.updateQuality();

    Assertions.assertThat(product.quality).isEqualTo(quality + 2);
  }

  @Test
  void updateSellIn_set_quality_to_zero_when_sellIn_less_0() {
    final Product product = new BackstagePasses(-1, quality);

    product.updateSellIn();

    Assertions.assertThat(product.quality).isZero();
  }

  @Test
  void nextDay_update_sellIn_after_quantity() {
    final Product product = new BackstagePasses(-1, quality);

    product.nextDay();

    assertThat(product.quality).isZero();
  }
}
